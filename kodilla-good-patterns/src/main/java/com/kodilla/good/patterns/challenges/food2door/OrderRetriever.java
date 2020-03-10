package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRetriever {

    public List<OrderRequest> retrieve() {
        List<OrderRequest> orderRequestList = new ArrayList<>();

        Customer customer = new Customer("ThomasPadington");
        FoodProducer foodProducer = new GlutenFreeShop();
        Map<Product, Integer> productsList = new HashMap<>();
        productsList.put(new GlutenFreeProduct("cookies", "Oat biscuits"), 45);
        productsList.put(new GlutenFreeProduct("snacks", "The simply delicious guilt-free snack"), 8);
        productsList.put(new GlutenFreeProduct("rice", "Brown rice"), 1);

        orderRequestList.add(new OrderRequest(customer, foodProducer, productsList));

        Customer customer1 = new Customer("JimBeans");
        FoodProducer foodProducer1 = new GlutenFreeShop();
        Map<Product, Integer> productsList1 = new HashMap<>();
        productsList.put(new GlutenFreeProduct("cookies", "Oat biscuits"), 45);
        productsList.put(new GlutenFreeProduct("snacks", "The simply delicious guilt-free snack"), 8);
        productsList.put(new GlutenFreeProduct("rice", "Brown rice"), 1);

        orderRequestList.add(new OrderRequest(customer1, foodProducer1, productsList1));

        Customer customer2 = new Customer("WhiliamThell");
        FoodProducer foodProducer2 = new HealthyShop();
        Map<Product, Integer> productsList2 = new HashMap<>();
        productsList.put(new MeatProduct("beef", "T-bone"), 4);

        orderRequestList.add(new OrderRequest(customer2, foodProducer2, productsList2));

        return orderRequestList;

    }
}
