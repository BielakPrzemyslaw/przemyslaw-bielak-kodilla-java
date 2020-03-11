package com.kodilla.good.patterns.challenges.flights;

import java.time.Duration;
import java.util.HashMap;

public class Application {
    public static void main (String[] args) {

        FlightsRetriever currentFlightList = new FlightsRetriever();
        FlightSearchProcessor flightSearch = new FlightSearchProcessor();

        String selectedAirport = "WRO";
        System.out.println("\nList of flights departing from : " + selectedAirport);

        flightSearch.departureAirportSearch(currentFlightList.retrieve(), selectedAirport).stream()
                .map(n -> n.getDepartureTime() + " " + n.getFlightNumber() + " to " + n.getArrivalAirport())
                .sorted()
                .forEach(System.out::println);

        selectedAirport = "KRK";
        System.out.println("\nList of flights arriving to: " + selectedAirport);

        flightSearch.arrivalAirportSearch(currentFlightList.retrieve(), selectedAirport).stream()
                .map(n -> n.getArrivalTime() + " " + n.getFlightNumber() + " to " + n.getDepartureTime())
                .sorted()
                .forEach(System.out::println);


        String selectedDepartingAirport = "GDN";
        String selectedArrivalAirport = "WRO";

        HashMap<Flight, Flight> connections = flightSearch.connectionFlightSearch(currentFlightList.retrieve(), selectedDepartingAirport, selectedArrivalAirport);

        System.out.println("\n" + connections.size() + " connections found on route [ " + selectedDepartingAirport + " -> via -> " + selectedArrivalAirport + " ]");
        connections.entrySet().stream()
                .map(n -> n.getKey().getDepartureTime()
                        + " "
                        + n.getKey().getFlightNumber()
                        + " & "
                        + n.getValue().getFlightNumber()
                        + " via "
                        + n.getValue().getDepartureAirport()
                        + ", total flight time "
                        + Duration.between(n.getValue().getArrivalTime(), n.getKey().getDepartureTime()).toString().substring(3)
                        + ", change planes "
                        + Duration.between(n.getValue().getDepartureTime(), n.getKey().getArrivalTime()).toString().substring(3)
                        + ", arriving "
                        + n.getValue().getArrivalTime())
                .sorted()
                .forEach(System.out::println);
    }
}
