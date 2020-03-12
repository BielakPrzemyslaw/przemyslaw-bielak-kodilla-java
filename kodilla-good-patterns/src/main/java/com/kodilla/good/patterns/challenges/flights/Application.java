package com.kodilla.good.patterns.challenges.flights;

public class Application {

    public static void main (String[] args) {

        Airport waw = new Airport("WAW");
        Airport fra = new Airport("FRA");
        Airport krk = new Airport("KRK");
        Airport wro = new Airport("WRO");

        FlightSearchProcessor flightSearch = new FlightSearchProcessor();
        flightSearch.addFlight(new Flight("LO19022", waw, krk));
        flightSearch.addFlight(new Flight("LO19024", krk, fra));
        flightSearch.addFlight(new Flight("LO19102", krk, wro));
        flightSearch.addFlight(new Flight("LO19323", waw, wro));
        flightSearch.addFlight(new Flight("LO19452", wro, krk));

        System.out.println("Flights by selected departure airport");
        System.out.println(flightSearch.searchDepartureAirport(waw));

        System.out.println("Flights by selected departure airport");
        System.out.println(flightSearch.searchArrivalAirport(wro));

        System.out.println("Transfer flights");
        System.out.println(flightSearch.searchTransferFlight(waw, krk, wro));

    }
}
