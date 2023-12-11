package Ticket;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import Ticket.Models.Customer;
import Ticket.Models.Ticket;
import Ticket.Services.CashProvider;
import Ticket.Services.TicketProvider;

public class Main {
    public static void main(String[] args) {

        CashProvider cashProvider = new CashProvider(23423340, false);
        TicketProvider ticketProvider = new TicketProvider();
        List<Ticket> tickets = new ArrayList<>();
        List<Ticket> ticketsNew = new ArrayList<>();
        Ticket ticket;
        Customer customer = new Customer(0, cashProvider, tickets, ticketProvider);

        Date date = new Date(0);

        ticketsNew = customer.searchTicket(date); // Покупатель запрашивает список билетов
        ticket = customer.selectTicketFromList(ticketsNew); // Покупатель выбирает билет
        Boolean authorizUser = customer.authorizUserTel("89056067898"); // Покупатель авторизуется
        System.out.println(authorizUser);
        if (customer.buyTicket(ticket)) // Покупатель покупает билет
            System.out.printf("Билет %d куплен", ticket.getRootNumber());

        ticketsNew = customer.searchTicket(date); // Покупатель запрашивает список билетов
        ticket = customer.selectTicketFromList(ticketsNew); // Покупатель выбирает билет из списка
        authorizUser = customer.authorizUserTel("89056067898"); // Покупатель авторизуется
        System.out.println(authorizUser);
        if (customer.buyTicket(ticket)) // Покупатель покупает билет
            System.out.printf("Билет %d куплен", ticket.getRootNumber());
    }
}

