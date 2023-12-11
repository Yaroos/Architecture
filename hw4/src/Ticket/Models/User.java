package Ticket.Models;

public class User {
    private int idUser;
    private String firstName;
    private String telNumber;
    private String email;
    private int ticketNumber;

    public User(int idUser, String firstName, String telNumber, String email, int ticketNumber) {
        this.idUser = idUser;
        this.firstName = firstName;
        this.telNumber = telNumber;
        this.email = email;
        this.ticketNumber = ticketNumber;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

}

