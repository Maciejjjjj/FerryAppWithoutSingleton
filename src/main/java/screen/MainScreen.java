package screen;

import filesOperations.RestoringTickets;
import filesOperations.SavingTickets;
import ticket.TicketPriceSum;


import java.util.*;


public class MainScreen implements Screen {

    private static MainScreen instance;
   private TicketPriceSum ticketPriceSum = new TicketPriceSum();


    public static MainScreen INSTANCE() {
        if (instance == null) {
            instance = new MainScreen();
        }
        return instance;
    }

    private final Scanner scanner = new Scanner(System.in);
    private TicketTypeScreen newScreen = new TicketTypeScreen();


    public void interact() {

        System.out.println("Type 'START' to buy a ticket,\n" +
                "'SUM' to see total price,\n" +
                "'PRINT' to see all bought tickets,\n" +
                "'SAVE' to save list of bought tickets,\n" +
                "'RESTORE' to restore your previous session,\n" +
                "or 'EXIT' to exit.");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("START")) {

            newScreen.interact();
        } else if (response.equalsIgnoreCase("SUM")) {

            System.out.println("Your total price is: " + ticketPriceSum.getTotalCost() + "$\n");
            interact();
        } else if (response.equalsIgnoreCase("PRINT")) {

            System.out.println("Your tickets (nr/type/subtype/price): ");

            ticketPriceSum.printList();
            interact();
        } else if (response.equalsIgnoreCase("SAVE")) {

            SavingTickets savingTickets = new SavingTickets();

            savingTickets.saveTickets();
            savingTickets.saveListToFile();

            System.out.println("Tickets saved. ");
            interact();
        } else if (response.equalsIgnoreCase("restore")) {

            RestoringTickets restoringTickets = new RestoringTickets();

            restoringTickets.restoreTickets();

            interact();
        } else if (response.equalsIgnoreCase("EXIT")) {
            System.exit(0);
        } else {
            interact();
        }
    }
}
