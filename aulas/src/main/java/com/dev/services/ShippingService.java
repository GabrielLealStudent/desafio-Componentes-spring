package com.dev.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        if (order.basic < 100.00) {
            return 20.00;
        } else if ((order.basic >= 100.00) && (order.basic <= 200.00)) {
            return 12.00;
        }
        return 0.00;
    }
}
