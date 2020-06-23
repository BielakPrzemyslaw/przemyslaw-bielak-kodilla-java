package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class TakeAwayPackage extends PizzaOrderDecorator {
    protected TakeAwayPackage(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(0.5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + box";
    }
}
