package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmackNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll(RollType.STANDARD)
                .burgers(2)
                .sauce(SauceType.THOUSAND_ISLANDS)
                .ingredients(IngredientsType.CHEESE)
                .ingredients(IngredientsType.CHILI_PEPPERS)
                .ingredients(IngredientsType.LETTUCE)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);

    }
}
