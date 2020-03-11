package com.kodilla.good.patterns.challenges.flights;

import java.time.LocalTime;
import java.util.ArrayList;

public class FlightsRetriever {

    public ArrayList<Flight> retrieve() {

        ArrayList<Flight> flightsList = new ArrayList<>();

        flightsList.add(new Flight("LO3828", "GDN", LocalTime.of(5,35), "KRK",  LocalTime.of(6,35)));
        flightsList.add(new Flight("LO3832", "GDN", LocalTime.of(8,50), "WRO",  LocalTime.of(9,45)));
        flightsList.add(new Flight("LO3836", "GDN", LocalTime.of(12,10), "WRO",  LocalTime.of(13,5)));
        flightsList.add(new Flight("LO3816", "GDN", LocalTime.of(18,10), "WRO",  LocalTime.of(19,10)));
        flightsList.add(new Flight("LO3826", "GDN", LocalTime.of(21,5), "WRO",  LocalTime.of(22,00)));
        flightsList.add(new Flight("LO3501", "GDN", LocalTime.of(20,20), "KRK",  LocalTime.of(21,40)));

        flightsList.add(new Flight("LO3828", "KRK", LocalTime.of(6,35), "WRO",  LocalTime.of(8,00)));
        flightsList.add(new Flight("LO3910", "KRK", LocalTime.of(5,50), "WRO",  LocalTime.of(6,30)));
        flightsList.add(new Flight("LO3555", "KRK", LocalTime.of(9,0), "WRO",  LocalTime.of(9,30)));
        flightsList.add(new Flight("LO3766", "KRK", LocalTime.of(10,35), "WRO",  LocalTime.of(11,10)));
        flightsList.add(new Flight("LO3908", "KRK", LocalTime.of(12,10), "WRO",  LocalTime.of(12,40)));
        flightsList.add(new Flight("LO3913", "KRK", LocalTime.of(15,5), "GDN",  LocalTime.of(15,40)));

        flightsList.add(new Flight("LO3828", "WRO", LocalTime.of(8,00), "KRK",  LocalTime.of(9,40)));
        flightsList.add(new Flight("LO3905", "WRO", LocalTime.of(13,30), "KRK",  LocalTime.of(14,25)));
        flightsList.add(new Flight("LO3903", "WRO", LocalTime.of(7,30), "KRK",  LocalTime.of(8,25)));
        flightsList.add(new Flight("LO3923", "WRO", LocalTime.of(16,40), "KRK",  LocalTime.of(17,35)));
        flightsList.add(new Flight("LO3921", "WRO", LocalTime.of(19,40), "KRK",  LocalTime.of(20,35)));
        flightsList.add(new Flight("LO3911", "WRO", LocalTime.of(22,45), "KRK",  LocalTime.of(23,40)));
        flightsList.add(new Flight("LO3919", "WRO", LocalTime.of(15,20), "KRK",  LocalTime.of(16,15)));

        return flightsList;
    }
}
