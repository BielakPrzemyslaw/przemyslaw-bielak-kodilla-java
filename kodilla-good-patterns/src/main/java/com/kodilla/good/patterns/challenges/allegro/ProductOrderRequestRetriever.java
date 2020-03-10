package com.kodilla.good.patterns.challenges.allegro;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductOrderRequestRetriever {

        public ProductOrderRequest retrieve() {
            User user = new User("MarkO", "Marek", "Olesnicki");
            LocalDateTime orderDate = LocalDateTime.of(2020,1,12,21,02);
            Product product = new Books("Clean code", "Robert C. Martin", new BigDecimal(50));
            int quantity = 1;

            System.out.println("Retrieve product request order:");
            System.out.println("User: " + user.getUserName() + " Date: " + orderDate + "\n" + product + " quantity=" + quantity);
            return new ProductOrderRequest(user, orderDate, product, quantity);

    }
}
