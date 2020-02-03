package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        //Given
        World world = new World();

        Continent asia = new Continent("Asia");
        Continent europa = new Continent("Europa");

        Country germany = new Country("Germany");
        Country czech = new Country("Czech");
        Country poland = new Country("Poland");
        Country russia = new Country("Russia");
        Country china = new Country("China");
        Country japan = new Country("Japan");

        world.addContinent(asia);
        world.addContinent(europa);

        europa.addCountry(germany);
        europa.addCountry(czech);
        europa.addCountry(poland);
        europa.addCountry(russia);

        asia.addCountry(china);
        asia.addCountry(japan);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal totalPeopleExpected = new BigDecimal("9090909");
        Assert.assertEquals(totalPeopleExpected, totalPeople);
    }
}
