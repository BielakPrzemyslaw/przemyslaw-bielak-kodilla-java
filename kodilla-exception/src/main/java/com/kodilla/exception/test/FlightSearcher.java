package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {
    private final Map<String, Boolean> airportMap;

    public FlightSearcher() {
        airportMap = airportDataBase();
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        return findAirport(flight.getArrivalAirport()) && findAirport(flight.getDepartureAirport());
    }

    private boolean findAirport(String airportName) throws RouteNotFoundException{
        if (airportMap.containsKey(airportName)) {
            return airportMap.get(airportName);
        }else{
            throw new RouteNotFoundException("Airport does not exist!");
        }
    }

    private Map<String, Boolean> airportDataBase() {
        Map<String, Boolean> airportDataBase = new HashMap<>();
        airportDataBase.put("WAR", true);
        airportDataBase.put("LON", true);
        airportDataBase.put("FRA", false);
        airportDataBase.put("WRO", false);
        airportDataBase.put("ROM", true);
        //TEST
        // airportDataBase.put("NYC", true);

        return airportDataBase;
    }
}
