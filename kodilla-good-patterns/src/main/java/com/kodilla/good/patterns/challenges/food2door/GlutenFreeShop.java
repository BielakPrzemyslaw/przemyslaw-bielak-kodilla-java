package com.kodilla.good.patterns.challenges.food2door;

import java.util.*;

public class GlutenFreeShop implements FoodProducer {
    private Map<Product, Integer> productsList;
    private List<Customer> specialList;

    public GlutenFreeShop() {
        productsList = createProductsList();
        specialList = createSpecialList();
    }

    private Map<Product, Integer> createProductsList() {

        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new GlutenFreeProduct("cookies", "Oat biscuits"), 61);
        productsList.put(new GlutenFreeProduct("snacks", "The simply delicious guilt-free snack"), 12);
        productsList.put(new GlutenFreeProduct("rice", "Brown rice"), 13);

        return productsList;
    }

    private List<Customer> createSpecialList() {
        List<Customer> specialList = new ArrayList<>();
        specialList.add(new Customer("ThomasPadington"));
        return specialList;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> productsOrders) {
        return (!specialList.contains(customer) && isProductAvailible(productsOrders));
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
