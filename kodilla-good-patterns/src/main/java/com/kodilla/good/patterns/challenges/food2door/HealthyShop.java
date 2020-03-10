package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HealthyShop implements FoodProducer {
    private Map<Product, Integer> productsList;

    public HealthyShop() {
        productsList = createProductsList();
    }

    private Map<Product, Integer> createProductsList() {

        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new GlutenFreeProduct("pasta", "Noodles made from rice flour"), 5);
        productsList.put(new GlutenFreeProduct("corn crisps", "Crisps made from corn flour"), 23);

        return productsList;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> productsOrder) {
        return (productsOrder.size() >= 2 && isProductAvailible(productsOrder));
    }

    private boolean isProductAvailible(Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()) {
            Optional<Integer> productQquantity = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQquantity.orElse(0) < entry.getValue()) {
                System.out.println("Gluten Free Shop: Product is unavailable.");
                return false;
            }
        }
        return true;

    }
}
