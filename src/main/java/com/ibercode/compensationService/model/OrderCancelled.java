package com.ibercode.compensationService.model;

public class OrderCancelled {
    private Data data;
    private Metadata metadata;

    public OrderCancelled() {
    }

    public OrderCancelled(Data data, Metadata metadata) {
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
