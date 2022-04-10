package com.ibercode.fulfillment;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.ibercode.fulfillment.model.AWSEvent;
import com.ibercode.fulfillment.model.OrderFulfillment;
import com.ibercode.fulfillment.model.marshaller.Marshaller;
import com.ibercode.fulfillment.utils.SNSUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FulfillmentService implements RequestStreamHandler {

    private final SNSUtils snsUtils = new SNSUtils();

    public void handleRequest(InputStream input, OutputStream output, Context context) throws IOException {

        AWSEvent<OrderFulfillment> event = Marshaller.unmarshalEvent(input,OrderFulfillment.class);

        OrderFulfillment order = event.getDetail();

        snsUtils.publishSNSMessage(String.format("%s %s", "Your order has shipped! Order ID:", order.getData().getOrderId()));
    }
}