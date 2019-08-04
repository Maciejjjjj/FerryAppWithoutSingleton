package vehicleTicket.vehicleTicketTypes;

import ticket.Ticket;

public class BikeTicket implements Ticket {
    public double getPrice() {
        return 10.00;
    }

    @Override
    public String getType() {
        return "Vehicle";
    }

    @Override
    public String getSubType() {
        return "Bike";
    }
}
