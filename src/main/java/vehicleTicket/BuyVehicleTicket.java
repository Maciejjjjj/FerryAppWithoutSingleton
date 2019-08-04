package vehicleTicket;

import screen.MainScreen;
import screen.Screen;
import screen.TicketTypeScreen;
import ticket.Ticket;
import ticket.TicketFactory;
import ticket.TicketPriceSum;
import vehicleTicket.vehicleTicketTypes.BusTicket;
import vehicleTicket.vehicleTicketTypes.TruckTicket;

import java.util.Scanner;


public class BuyVehicleTicket implements Screen {

    private final Scanner scanner = new Scanner(System.in);
    private MainScreen mainScreen = MainScreen.INSTANCE();
    private TicketTypeScreen ticketTypeScreen = TicketTypeScreen.INSTANCE();
    private TicketPriceSum ticketPriceSum;

    public BuyVehicleTicket(TicketPriceSum ticketPriceSum) {
        this.ticketPriceSum = ticketPriceSum;
    }

    public void interact() {
        String response;
        System.out.println("Please choose your vehicle type:\n" +
                " 1- Car\n" +
                " 2- Bike\n" +
                " 3- Truck\n" +
                " 4- Bus\n" +
                " or type 'RETURN' to return.");

        response = scanner.next();

        if (response.equalsIgnoreCase("RETURN")) {

            ticketTypeScreen.interact();
        } else if (response.matches("\\d+")) {
            if (Integer.parseInt(response) >= 1 && Integer.parseInt(response) <= 4) {

                TicketFactory ticketFactory = new TicketFactory();

                Ticket ticket = ticketFactory.createVehicleTicket(Integer.parseInt(response));
                double calculatedPrice;

                switch (Integer.parseInt(response)) {
                    case 1:
                        calculatedPrice = ticket.getPrice();
                        System.out.println("Ticket price: " + calculatedPrice + "$");
                        ticketPriceSum.add(ticket);

                        break;
                    case 2:
                        calculatedPrice = ticket.getPrice();
                        System.out.println("Ticket price: " + calculatedPrice + "$");
                        ticketPriceSum.add(ticket);

                        break;
                    case 3:
                        TruckTicket truckTicket = new TruckTicket();
                        calculatedPrice = truckTicket.calculatePrice();
                        System.out.println("Ticket price: " + calculatedPrice + "$");
                        ticketPriceSum.add(truckTicket);

                        break;
                    default:
                        BusTicket busTicket = new BusTicket();
                        calculatedPrice = busTicket.calculatePrice();
                        System.out.println("Ticket price: " + calculatedPrice + "$");
                        ticketPriceSum.add(busTicket);

                        break;

                }

                mainScreen.interact();
            } else {
                System.out.println("Wrong car type, try again.");
                interact();
            }

        } else {
            System.out.println("Wrong car type, try again.");
            interact();
        }
    }
}

