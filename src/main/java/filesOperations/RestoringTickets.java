package filesOperations;

import ticket.Ticket;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

public class RestoringTickets {

    public void restoreTickets() {

        Map<Integer, Ticket> ticketMap;

        try (
                FileInputStream fis = new FileInputStream("C:\\Users\\Twoja stara\\Desktop\\projekty\\Java\\1Kurs\\Projekty\\FerryApp\\listOfTickets.ser");
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            ticketMap = (HashMap<Integer, Ticket>) ois.readObject();

        } catch (
                IOException ioe) {
            System.out.println("1");
            ioe.getMessage();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.getMessage();
            return;
        }

//        AllTickets.ticketsMap = ticketMap;
//        System.out.println("Tickets restored.");


    }
}
