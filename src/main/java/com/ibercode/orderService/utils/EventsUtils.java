package com.ibercode.orderService.utils;

import com.google.gson.Gson;
import com.ibercode.orderService.model.OrderCreated;
import software.amazon.awssdk.core.SdkSystemSetting;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.eventbridge.EventBridgeClient;
import software.amazon.awssdk.services.eventbridge.model.PutEventsRequest;
import software.amazon.awssdk.services.eventbridge.model.PutEventsRequestEntry;
import software.amazon.awssdk.services.eventbridge.model.PutEventsResponse;

public class EventsUtils {

    private final EventBridgeClient eventBrClient = EventBridgeClient.builder()
            .region(Region.of(System.getenv(SdkSystemSetting.AWS_REGION.environmentVariable())))
            .build();
    private final Gson gson = new Gson();

    public void publishEvent(OrderCreated orderCreated){

        PutEventsRequestEntry reqEntry = PutEventsRequestEntry.builder()
                .source("com.ibercode.orders")
                .detailType("orderCreated")
                .detail(gson.toJson(orderCreated))
                .eventBusName("OrdersEventBus")
                .build();

        PutEventsRequest eventsRequest = PutEventsRequest.builder()
                .entries(reqEntry)
                .build();

        PutEventsResponse result = eventBrClient.putEvents(eventsRequest);

        System.out.println(result.entries().size());

    }
}
