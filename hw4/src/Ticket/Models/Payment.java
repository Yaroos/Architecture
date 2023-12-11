package Ticket.Models;

import java.sql.Date;

public class Payment {
    private static int counter = 9000;
    private final int id;

    {
        id = ++counter;
    }
    private int idTicket;
    private Date dateTime;
    private int summOfPayment;
    private int idUser;

    public Payment(Date dateTime, int summOfPayment, int idTicket) {
        this.dateTime = dateTime;
        this.summOfPayment = summOfPayment;
        this.idTicket = idTicket;
    }

    public static int getCounter() {
        return counter;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public int getId() {
        return id;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public int getSummOfPayment() {
        return summOfPayment;
    }

    public int getIdUser() {
        return idUser;
    }

}
