package ticket;

import personTicket.PersonType;
import personTicket.personTicketTypes.AdultTicket;
import personTicket.personTicketTypes.ChildTicket;
import personTicket.personTicketTypes.SeniorTicket;
import personTicket.personTicketTypes.YoungTicket;
import vehicleTicket.vehicleTicketTypes.BikeTicket;
import vehicleTicket.vehicleTicketTypes.BusTicket;
import vehicleTicket.vehicleTicketTypes.CarTicket;
import vehicleTicket.vehicleTicketTypes.TruckTicket;


public class TicketFactory {

    public Ticket createPersonTicket(int age) {

        PersonType personType;

        if (age >= 0 && age < 3) {
            personType = PersonType.CHILD;
        } else if (age >= 3 && age < 18) {
            personType = PersonType.YOUNG;
        } else if (age >= 18 && age < 70) {
            personType = PersonType.ADULT;
        } else {
            personType = PersonType.SENIOR;
        }

        switch (personType) {
            case CHILD:
                ChildTicket childTicket = new ChildTicket();
                return childTicket;
            case YOUNG:
                YoungTicket youngTicket = new YoungTicket();
                return youngTicket;
            case ADULT:
                AdultTicket adultTicket = new AdultTicket();
                return adultTicket;
            default:
                SeniorTicket seniorTicket = new SeniorTicket();
                return seniorTicket;
        }
    }

    public Ticket createVehicleTicket(int vehicleType) {

        switch (vehicleType) {
            case 1:
                CarTicket carTicket = new CarTicket();
                return carTicket;
            case 2:
                BikeTicket bikeTicket = new BikeTicket();
                return bikeTicket;
            case 3:
                TruckTicket truckTicket = new TruckTicket();
                return truckTicket;
            default:
                BusTicket busTicket = new BusTicket();
                return busTicket;
        }
    }
}
