package com.ibercode.orderService;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.ibercode.orderService.model.Data;
import com.ibercode.orderService.model.Metadata;
import com.ibercode.orderService.model.OrderCreated;
import com.ibercode.orderService.model.OrderReceived;
import com.ibercode.orderService.utils.EventsUtils;

import java.util.UUID;

public class OrderService  implements RequestHandler<OrderReceived, String> {

    private final EventsUtils eventsUtils = new EventsUtils();

    @Override
    public String handleRequest(OrderReceived orderReceived, Context context) {

        Data data = new Data(orderReceived.getAmount(), orderReceived.getCustomerId(), orderReceived.getOrderId());
        Metadata metadata = new Metadata(UUID.randomUUID().toString());
        OrderCreated orderCreated = new OrderCreated(data, metadata);

        eventsUtils.publishEvent(orderCreated);

        return "Order Received";
    }

}
