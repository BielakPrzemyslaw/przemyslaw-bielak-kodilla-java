package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ExtraFoodShop implements FoodProducer {
    private Map<Product, Integer> productsList;

    public ExtraFoodShop() {
        productsList = createProductsList();
    }

    private Map<Product, Integer> createProductsList() {
        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new MeatProduct("beef", "T-bone"), 40);
        productsList.put(new MeatProduct("beef", "Porterhouse Steak"), 25);

        return productsList;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer>productsOrders) {

        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()) {
            Optional<Integer> productQquantity = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQquantity.orElse(0) < entry.getValue()) {
                System.out.println("Product is unavailable.");
                return false;
            }
        }
        return true;
    }

}
