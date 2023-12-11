package Ticket.Services;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import Ticket.Models.Ticket;

public class TicketProvider {

    private List<Ticket> tickets;

    public List<Ticket> getTicketList(Date date) {
        if (tickets == null) {
            tickets = new ArrayList<>();

            tickets.add(new Ticket(0, 1, 250, date, false));
            tickets.add(new Ticket(1, 1, 350, date, false));
            tickets.add(new Ticket(2, 1, 450, date, false));
            tickets.add(new Ticket(3, 1, 550, date, false));

        }
        return tickets;

    }

    public boolean updateTicket(int rootNumber, TicketProvider tp) {
        List<Ticket> tt = tp.getTickets();
        for (Ticket ticket : tt) {
            if (ticket.getRootNumber() == rootNumber) {
                ticket.setValid(true);
                System.out.println("Билет действителен");
            }
        }
        return true;
    }

    public TicketProvider() {

    }

    public List<Ticket> getTickets() {
        return tickets;
    }

}
