package screen;

import java.util.Scanner;

public class TicketTypeScreen implements Screen {

    private final Scanner scanner = new Scanner(System.in);
    private BuyTicketFactory buyTicketFactory = new BuyTicketFactory();
    private static TicketTypeScreen instance;

    public static TicketTypeScreen INSTANCE() {
        if (instance == null) {
            instance = new TicketTypeScreen();
        }
        return instance;
    }


        public void interact() {
        System.out.println("Choose ticket type, press:\n" +
                "1- person\n" +
                "2- vehicle\n" +
                "3- cargo\n" +
                "0- to RETURN");

        int response = scanner.nextInt();


        if (response == 1) {
            buyTicketFactory.buyPersonTicket();
        }

        if (response == 2) {
            buyTicketFactory.buyVehicleTicket();
        }

        if (response == 3) {
            buyTicketFactory.buyCargoTicket();
        }
        if (response == 0) {
            System.exit(0);
        } else {
            interact();
        }

    }
}
