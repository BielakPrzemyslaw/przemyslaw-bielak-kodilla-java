package com.kodilla.good.patterns.challenges.allegro;

public class ProductOrderProcessor {

    private static InformationService informationService;
    private static ProductOrderService productOrderService;
    private static ProductOrderRepository productOrderRepository;

    public ProductOrderProcessor(InformationService informationService, ProductOrderService productOrderService, ProductOrderRepository productOrderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
    }

    public static ProductOrderDTO process(ProductOrderRequest productOrderRequest) {
        boolean isSuccessfullySold = productOrderService.sold(productOrderRequest.getUser(),productOrderRequest.getOrderDate(),productOrderRequest.getProduct(),productOrderRequest.getQuantity());
        if(isSuccessfullySold) {
            informationService.inform(productOrderRequest.getUser());
            productOrderRepository.createProductOrder(productOrderRequest.getUser(), productOrderRequest.getOrderDate(), productOrderRequest.getProduct(),productOrderRequest.getQuantity());
        } else {
            System.out.println("Your order has been rejected. Pleas tray again.");
        }

        return new ProductOrderDTO(productOrderRequest.getUser(), productOrderRequest.getOrderDate(), productOrderRequest.getQuantity(), isSuccessfullySold);
    }

}
