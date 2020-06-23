package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);

    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Your ordered pizza", description);
    }

    @Test
    public void testBasicPizzaOrderTakeAwayPackageAndDeliveryGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new TakeAwayPackage(theOrder);
        theOrder = new FreeDeliveryDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15.5), calculatedCost);

    }

    @Test
    public void testBasicPizzaOrderTakeAwayPackageAndDeliveryGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new TakeAwayPackage(theOrder);
        theOrder = new FreeDeliveryDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Your ordered pizza + box + free delivery", description);
    }

    @Test
    public void testBasicPizzaOrderCalzoneDoubleCheeseHamMushroomsDriedTomatoesTakeAwayPackageAndDeliveryGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CalzoneDecorator(theOrder);
        theOrder = new DoubleCheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new TomatoesDecorator(theOrder);
        theOrder = new TakeAwayPackage(theOrder);
        theOrder = new FreeDeliveryDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(24.5).setScale(2), calculatedCost.setScale(2));

    }

    @Test
    public void testBasicPizzaOrderCalzoneDoubleCheeseHamMushroomsDriedTomatoesTakeAwayPackageAndDeliveryGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CalzoneDecorator(theOrder);
        theOrder = new DoubleCheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new TomatoesDecorator(theOrder);
        theOrder = new TakeAwayPackage(theOrder);
        theOrder = new FreeDeliveryDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Your ordered pizza calzone " +
                "+ double cheese + ham + mushrooms + dried tomatoes " +
                "+ box + free delivery", description);
    }
}

