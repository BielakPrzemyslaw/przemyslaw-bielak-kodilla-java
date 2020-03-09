package com.kodilla.good.patterns.challenges.allegro;

public class AllegroService {
    public static void main(String[] args) {
        ProductOrderRequestRetriever productOrderRequestRetriever = new ProductOrderRequestRetriever();
        ProductOrderRequest productOrderRequest = productOrderRequestRetriever.retriever();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MailService(), new BookOrderService(), new BookOrderRepository());
        ProductOrderProcessor.process(productOrderRequest);
    }
}
