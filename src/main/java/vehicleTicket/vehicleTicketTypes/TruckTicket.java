package vehicleTicket.vehicleTicketTypes;

import ticket.Ticket;

import java.util.Scanner;

public class TruckTicket implements Ticket {

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
        return "Truck";
    }

    public double calculatePrice() {
        System.out.println("Please enter truck weight [tons]:");
        double weight = scanner.nextDouble();
        return calculatedPrice = weight * 10.00;
    }
}
