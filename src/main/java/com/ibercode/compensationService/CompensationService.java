package com.ibercode.compensationService;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.ibercode.compensationService.model.OrderCancelled;

public class CompensationService implements RequestHandler<OrderCancelled,OrderCancelled> {

    @Override
    public OrderCancelled handleRequest(OrderCancelled order, Context context) {

        //Execute Compensating Transactions

        return order;
    }
}
