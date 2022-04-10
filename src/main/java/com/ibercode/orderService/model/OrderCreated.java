package com.ibercode.orderService.model;

public class OrderCreated {

    private Data data;
    private Metadata metadata;

    public OrderCreated() {
    }

    public OrderCreated(Data data, Metadata metadata) {
        this.data = data;
        this.metadata = metadata;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }
}