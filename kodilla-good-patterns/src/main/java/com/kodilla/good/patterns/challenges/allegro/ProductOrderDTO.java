package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class ProductOrderDTO {

    private User user;
    private LocalDateTime orderDate;
    private int quantity;
    private boolean isSuccesfullySold;

    public ProductOrderDTO(User user, LocalDateTime orderDate, Product product, int quantity, boolean isSuccesfullySold) {
        this.user = user;
        this.orderDate = orderDate;
        this.quantity = quantity;
        this.isSuccesfullySold = isSuccesfullySold;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {

        return orderDate;
    }

    public int getQuantity() {

        return quantity;
    }

    public boolean isSuccesfullySold() {

        return isSuccesfullySold;
    }
}
