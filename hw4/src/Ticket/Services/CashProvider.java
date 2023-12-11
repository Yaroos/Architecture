package Ticket.Services;

import Ticket.Models.Payment;
import Ticket.Models.User;

public class CashProvider {
    private long numberCard;
    private boolean isAutorized;

    public boolean authorization(User user) {
        if (user != null) {
            isAutorized = true;

            System.out.println("Авторизация прошла успешно");
            return true;
        }
        return false;
    }

    public boolean buy(Payment payment, TicketProvider tp) {
        if (isAutorized) {
            updateTicketBought(payment, tp);
            return true;
        } else
            return false;
    }

    private boolean updateTicketBought(Payment payment, TicketProvider tp) {

        // TicketProvider tp = new TicketProvider();
        tp.updateTicket(payment.getIdTicket(), tp);
        return true;
    }

    public CashProvider(long numberCard, boolean isAutorized) {
        this.numberCard = numberCard;
        this.isAutorized = isAutorized;
    }

}

