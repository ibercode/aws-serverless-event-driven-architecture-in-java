package com.ibercode.inventoryService;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.ibercode.inventoryService.model.Order;

public class InventoryService implements RequestHandler<Order, Order> {

    @Override
    public Order handleRequest(Order order, Context context) {

        // handle inventory

        System.out.println(order.getMetadata().getCorrelationId());
        return order;
    }
}