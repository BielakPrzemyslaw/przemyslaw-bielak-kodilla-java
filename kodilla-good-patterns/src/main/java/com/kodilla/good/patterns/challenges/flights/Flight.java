package com.kodilla.good.patterns.challenges.flights;

public class Flight {
    private final String flightNumber;
    private final Airport departureAirport;
    private final Airport arrivalAirport;


    public Flight(String flightNumber, Airport departureAirport,  Airport arrivalAirport) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;

    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;

        if (!flightNumber.equals(flight.flightNumber)) return false;
        if(!departureAirport.equals(flight.departureAirport)) return false;
        return arrivalAirport.equals(flight.arrivalAirport);
    }

    @Override
    public int hashCode() {
        int result = flightNumber.hashCode();
        result = 31 * result + departureAirport.hashCode();
        result = 31 * result + arrivalAirport.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "departure airport " + departureAirport + ", arrival airport " + arrivalAirport + "\n";
    }
}
