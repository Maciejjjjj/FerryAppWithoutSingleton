package vehicleTicket.vehicleTicketTypes;

import ticket.Ticket;

public class CarTicket implements Ticket {
    public double getPrice() {
        return 20.00;
    }

    @Override
    public String getType() {
        return "Vehicle";
    }

    @Override
    public String getSubType() {
        return "Car";
    }
}
