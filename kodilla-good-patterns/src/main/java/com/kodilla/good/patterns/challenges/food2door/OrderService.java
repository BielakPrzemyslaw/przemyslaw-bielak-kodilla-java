package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class OrderService {

    public void processAllOrders(List<OrderRequest> orderRequests) {

        orderRequests.stream()
                .map(n -> {
                    System.out.println("Procesing your order " + n.getCustomer().getName());
                    return n.getFoodProducer().process(n.getCustomer(), n.getProductOrderRequest());
                })
                .forEach(t -> System.out.println("Order success: " + t + "\n"));
    }
}
