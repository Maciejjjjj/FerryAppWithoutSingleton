package screen;

import ticket.TicketPriceSum;
import vehicleTicket.BuyVehicleTicket;
import personTicket.BuyPersonTicket;

public class BuyTicketFactory {

    TicketPriceSum ticketPriceSum = new TicketPriceSum();

    public void buyPersonTicket() {
        BuyPersonTicket buyPersonTicket = new BuyPersonTicket(ticketPriceSum);
        buyPersonTicket.interact();
    }

    public void buyVehicleTicket() {
        BuyVehicleTicket buyVehicleTicket = new BuyVehicleTicket(ticketPriceSum);
        buyVehicleTicket.interact();
    }

    public void buyCargoTicket() {

    }

}
