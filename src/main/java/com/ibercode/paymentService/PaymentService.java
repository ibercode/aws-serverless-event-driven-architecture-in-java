package com.ibercode.paymentService;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.ibercode.paymentService.model.AWSEvent;
import com.ibercode.paymentService.model.OrderCreated;
import com.ibercode.paymentService.model.marshaller.Marshaller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

public class PaymentService implements RequestStreamHandler {

    public void handleRequest(InputStream input, OutputStream output, Context context) throws IOException {

        AWSEvent<OrderCreated> event = Marshaller.unmarshalEvent(input, OrderCreated.class);

        OrderCreated orderCreated = event.getDetail();

        Random random = new Random();
        if (random.nextInt(2) == 1) {
            throw new PaymentException(orderCreated.getData().getOrderId());
        }
    }
}
