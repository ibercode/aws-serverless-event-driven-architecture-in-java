package com.ibercode.orderCancellationService;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.ibercode.fulfillment.utils.SNSUtils;
import com.ibercode.orderCancellationService.model.AWSEvent;
import com.ibercode.orderCancellationService.model.Marshaller;
import com.ibercode.orderCancellationService.model.OrderCancellation;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OrderCancellationService implements RequestStreamHandler {

    private final SNSUtils snsUtils = new SNSUtils();

    public void handleRequest(InputStream input, OutputStream output, Context context) throws IOException {

        AWSEvent<OrderCancellation> event = Marshaller.unmarshalEvent(input,OrderCancellation.class);

        OrderCancellation order = event.getDetail();

        snsUtils.publishSNSMessage(String.format("%s %s", "Order cancelled! Order ID:", order.getData().getOrderId()));
    }
}