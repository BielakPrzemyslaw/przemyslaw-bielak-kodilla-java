package com.kodilla.good.patterns.challenges.food2door;

public class MeatProduct extends Product {
    private String typeOfSteak;

    public MeatProduct(String productName, String typeOfSteak) {
        super(productName);
        this.typeOfSteak = typeOfSteak;
    }
}
