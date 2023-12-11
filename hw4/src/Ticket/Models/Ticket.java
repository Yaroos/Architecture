package Ticket.Models;

import java.sql.Date;

public class Ticket {
    public int rootNumber;
    public int place;
    public int price;
    public Date time;
    public boolean isValid;

    public Ticket(int rootNumber, int place, int price, Date time, boolean isValid) {
        this.rootNumber = rootNumber;
        this.place = place;
        this.price = price;
        this.time = time;
        this.isValid = isValid;
    }

    public int getRootNumber() {
        return rootNumber;
    }

    public int getPlace() {
        return place;
    }

    public int getPrice() {
        return price;
    }

    public Date getTime() {
        return time;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

}

