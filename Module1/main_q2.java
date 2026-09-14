import java.util.Scanner;

abstract class Flight {
    private String flightNumber;
    private String airline;
    private double fare;

    // Constructor
    public Flight(String flightNumber, String airline, double fare) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.fare = fare;
    }

    // Getters
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public double getFare() {
        return fare;
    }

    // Abstract method
    public abstract double calculateFare();

    @Override
    public String toString() {
        return "Flight No: " + flightNumber
                + " Airline: " + airline
                + " Fare: " + calculateFare();
    }
}

class DomesticFlight extends Flight {

    public DomesticFlight(String flightNumber, String airline, double fare) {
        super(flightNumber, airline, fare);
    }

    @Override
    public double calculateFare() {
        return getFare() + (getFare() * 0.10);
    }
}

class InternationalFlight extends Flight {

    public InternationalFlight(String flightNumber, String airline, double fare) {
        super(flightNumber, airline, fare);
    }

    @Override
    public double calculateFare() {
        return getFare() + (getFare() * 0.25);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter flight type,number,airline,fare");

        // Read first flight
        String[] details1 = sc.nextLine().split(",");

        String type1 = details1[0].trim();
        String number1 = details1[1].trim();
        String airline1 = details1[2].trim();
        double fare1 = Double.parseDouble(details1[3].trim());

        Flight flight1;

        if (type1.equalsIgnoreCase("Domestic")) {
            flight1 = new DomesticFlight(number1, airline1, fare1);
        } else {
            flight1 = new InternationalFlight(number1, airline1, fare1);
        }

        // Read second flight
        String[] details2 = sc.nextLine().split(",");

        String type2 = details2[0].trim();
        String number2 = details2[1].trim();
        String airline2 = details2[2].trim();
        double fare2 = Double.parseDouble(details2[3].trim());

        Flight flight2;

        if (type2.equalsIgnoreCase("Domestic")) {
            flight2 = new DomesticFlight(number2, airline2, fare2);
        } else {
            flight2 = new InternationalFlight(number2, airline2, fare2);
        }

        // Display details
        System.out.println(flight1);
        System.out.println(flight2);

        sc.close();
    }
}
