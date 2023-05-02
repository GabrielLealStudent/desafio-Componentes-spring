package com.dev.services;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order) {
        double disc = order.basic * (order.discount / 100);
        return order.basic - disc + shippingService.shipment(order);
    }

}
