package Ticket.Services;

import java.util.ArrayList;
import java.util.List;

import Ticket.Models.User;

public class UserProvider {
    private List<User> clients;

    public List<User> getClientList() {
        if (clients == null) {
            clients = new ArrayList<>();

            clients.add(new User(0, "Alla", "89056067898", "alla@mail.ru", 123321));
            clients.add(new User(0, "Olga", "89034325676", "olga@mail.ru", 234432));
            clients.add(new User(0, "Danyl", "89938907654", "danyl@mail.ru", 345543));
            clients.add(new User(0, "Ilya", "89982344556", "ilya@mail.ru", 456654));

        }
        return clients;
    }

    private User findUserByTel(List<User> users, String telNumber) {
        User userToFind = null;
        if (users.size() != 0) {
            for (User user : users) {
                if (user.getTelNumber().equals(telNumber))
                    userToFind = user;
            }
        }
        return userToFind;
    }

    public User searchUser(String telNumber) {
        UserProvider userProvider = new UserProvider();
        return findUserByTel(userProvider.getClientList(), telNumber);

    }

    public User authorizUserTel(String telNumber) {
        return searchUser(telNumber);
    }

}

