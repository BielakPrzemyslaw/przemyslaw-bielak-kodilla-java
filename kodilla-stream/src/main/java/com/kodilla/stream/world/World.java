package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> listOfContinentsOnWorld = new ArrayList<>();

    public boolean addContinent(Continent continent) {
        return listOfContinentsOnWorld.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantityOnWorld = (BigDecimal) listOfContinentsOnWorld.stream()
                .flatMap(continent -> continent.getListOfCoutriesOnContinent().stream())
                .distinct()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, country) -> sum.add(country));

        return peopleQuantityOnWorld;

    }
}
