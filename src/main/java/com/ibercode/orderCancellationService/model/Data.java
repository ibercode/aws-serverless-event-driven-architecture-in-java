package com.ibercode.orderCancellationService.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Objects;

public class Data implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("orderId")
  private String orderId = null;

  public Data amount(String amount) {
    this.amount = amount;
    return this;
  }
  

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Data customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }
  

  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Data orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }
  

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Data data = (Data) o;
    return Objects.equals(this.amount, data.amount) &&
        Objects.equals(this.customerId, data.customerId) &&
        Objects.equals(this.orderId, data.orderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, customerId, orderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Data {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
