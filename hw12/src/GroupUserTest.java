import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupUserTest {

    @org.junit.jupiter.api.Test
    void getUserList() {
        User userAlla = new User("Alla", "123Alla", 890080090);
        User userKatya = new User("Katya", "123Katya", 890080090);
        User userTolik = new User("Tolik", "123Tolik", 890080090);
        User userAlex = new User("Alex", "123Alex", 890080090);
        List<User> usersList = new ArrayList<>();
        usersList.add(userAlla);
        usersList.add(userKatya);
        usersList.add(userTolik);
        usersList.add(userAlex);
        GroupUser groupUser = new GroupUser(usersList);
        assertEquals(usersList, groupUser.getUserList());
    }

    @org.junit.jupiter.api.Test
    void findList() {
        User userAlla = new User("Alla", "123Alla", 890080090);
        User userKatya = new User("Katya", "123Katya", 890080090);
        User userTolik = new User("Tolik", "123Tolik", 890080090);
        User userAlex = new User("Alex", "123Alex", 890080090);
        List<User> usersList = new ArrayList<>();
        usersList.add(userAlla);
        usersList.add(userKatya);
        usersList.add(userTolik);
        usersList.add(userAlex);
        GroupUser groupUser = new GroupUser(usersList);
        assertEquals(userAlex, groupUser.findList("Alex", "123Alex"));
    }

    @org.junit.jupiter.api.Test
    void addUser() {
        User userAlla = new User("Alla", "123Alla", 890080090);
        User userKatya = new User("Katya", "123Katya", 890080090);
        User userTolik = new User("Tolik", "123Tolik", 890080090);
        User userAlex = new User("Alex", "123Alex", 890080090);
        List<User> usersList = new ArrayList<>();
        List<User> usersListTest = new ArrayList<>();
        usersList.add(userAlla);
        usersList.add(userKatya);
        usersList.add(userTolik);
        usersList.add(userAlex);
        GroupUser groupUser = new GroupUser(usersListTest);
        groupUser.addUser(userAlla);
        groupUser.addUser(userKatya);
        groupUser.addUser(userTolik);
        groupUser.addUser(userAlex);

        assertEquals(usersList, groupUser.getUserList());
    }
}