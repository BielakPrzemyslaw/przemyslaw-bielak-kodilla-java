package com.kodilla.good.patterns.challenges.flights;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchProcessor {

    private final HashMap<String, Flight> flightPlan = new HashMap<>();

    public void addFlight(Flight flight) {
        flightPlan.put(flight.getFlightNumber(), flight);
    }

    public List<Flight> searchDepartureAirport(Airport airport) {

        List<Flight> resultsDepartureAirport = flightPlan.values().stream()
                .filter(flight -> flight.getDepartureAirport().equals(airport))
                .collect(Collectors.toList());
        return resultsDepartureAirport;

    }

    public List<Flight> searchArrivalAirport(Airport airport) {

        List<Flight> resultsArrivalAirport = flightPlan.values().stream()
                .filter(flight -> flight.getArrivalAirport().equals(airport))
                .collect(Collectors.toList());
        return  resultsArrivalAirport;

    }

    public List<Flight> searchTransferFlight(Airport departureAirport, Airport destinationAirport, Airport transferAirport) {
        List<Flight> resultsTransferFlight = new ArrayList<>();

        Flight searchFirstFlight = flightPlan.values().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .filter(flight -> flight.getArrivalAirport().equals(transferAirport))
                .findAny().get();

        Flight searchSecondFlight = flightPlan.values().stream()
                .filter(flight -> flight.getDepartureAirport().equals(transferAirport))
                .filter(flight -> flight.getArrivalAirport().equals(destinationAirport))
                .findAny().get();

        resultsTransferFlight.add(searchFirstFlight);
        resultsTransferFlight.add(searchSecondFlight);

        return resultsTransferFlight;
    }

}
