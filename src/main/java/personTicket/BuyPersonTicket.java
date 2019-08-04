package personTicket;

import screen.MainScreen;
import screen.Screen;
import screen.TicketTypeScreen;
import ticket.Ticket;
import ticket.TicketFactory;
import ticket.TicketPriceSum;

import java.util.Scanner;

public class BuyPersonTicket extends TicketPriceSum implements Screen {

    private final Scanner scanner = new Scanner(System.in);

    private MainScreen mainScreen = MainScreen.INSTANCE();
    private TicketTypeScreen ticketTypeScreen = TicketTypeScreen.INSTANCE();
    private TicketPriceSum ticketPriceSum;

    public BuyPersonTicket(TicketPriceSum ticketPriceSum) {
        this.ticketPriceSum = ticketPriceSum;
    }

    public void interact() {
        String response;
        System.out.println("Please type your age or type 'RETURN' to return.");

        response = scanner.next();
        if (response.equalsIgnoreCase("RETURN")) {

            ticketTypeScreen.interact();
        } else if (response.matches("\\d+")) {


            TicketFactory ticketFactory = new TicketFactory();
            int age = Integer.parseInt(response);

            Ticket ticket = ticketFactory.createPersonTicket(age);

            System.out.println("Ticket price: " + ticket.getPrice() + "$");

            ticketPriceSum.add(ticket);


            mainScreen.interact();
        } else {
            System.out.println("Wrong age, try again.");
            interact();
        }
    }
}
