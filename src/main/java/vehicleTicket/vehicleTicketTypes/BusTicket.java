package vehicleTicket.vehicleTicketTypes;

import ticket.Ticket;

import java.util.Scanner;

public class BusTicket implements Ticket {

    private final Scanner scanner = new Scanner(System.in);
    double calculatedPrice;

    public double getPrice() {
        return this.calculatedPrice;
    }

    @Override
    public String getType() {
        return "Vehicle";
    }

    @Override
    public String getSubType() {
        return "Bus";
    }

    public double calculatePrice() {
        System.out.println("Please enter bus length [meters]:");
        double length = scanner.nextDouble();
        return calculatedPrice = length * 5.0;
    }
}
