package com.ibercode.orderService.model;

public class Data {

  private String amount;
  private String customerId;
  private String orderId;

  public Data() {
  }

  public Data(String amount, String customerId, String orderId) {
    this.amount = amount;
    this.customerId = customerId;
    this.orderId = orderId;
  }

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }
}
