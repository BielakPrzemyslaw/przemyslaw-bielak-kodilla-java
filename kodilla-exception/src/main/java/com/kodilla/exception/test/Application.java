package com.kodilla.exception.test;

public class Application {
    public static void main(String[] args) {
        Flight warLon = new Flight("WAR", "LON");
        Flight romWro = new Flight("ROM", "WRO");
        Flight fraNyc = new Flight("FRA", "NYC");

        FlightSearcher flightSearcher = new FlightSearcher();

        try {
            boolean existWarLon = flightSearcher.findFlight(warLon);
            System.out.println("Flight Warsaw - London: " + existWarLon);
        } catch (RouteNotFoundException e) {
            System.out.println("Please input correct airport name.");
        }

        try {
            boolean existRomWro = flightSearcher.findFlight(romWro);
            System.out.println("Flight Rome - Wroclaw City: " + existRomWro);
        } catch (RouteNotFoundException e) {
            System.out.println("Please input correct airport name.");
        }

        try {
            boolean existFraNyc = flightSearcher.findFlight(fraNyc);
            System.out.println("Flight Frankfurt - NY City: " + existFraNyc);
        } catch (RouteNotFoundException e) {
            System.out.println("Please input correct airport name.");
        }

    }

}
