package com.ibercode.inventoryService.model;

public class Metadata {
    private String correlationId;

    public Metadata() {
    }

    public Metadata(String correlationId) {
        this.correlationId = correlationId;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }
}
