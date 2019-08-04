package personTicket.personTicketTypes;

import ticket.Ticket;

public class ChildTicket implements Ticket {


    public double getPrice() {
        return 0.00;
    }

    @Override
    public String getType() {
        return "Person";
    }

    @Override
    public String getSubType() {
        return "Child";
    }
}
