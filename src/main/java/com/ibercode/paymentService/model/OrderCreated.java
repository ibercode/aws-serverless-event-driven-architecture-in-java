package com.ibercode.paymentService.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Objects;

public class OrderCreated implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("data")
  private Data data = null;

  @JsonProperty("metadata")
  private Metadata metadata = null;

  public OrderCreated data(Data data) {
    this.data = data;
    return this;
  }
  

  public Data getData() {
    return data;
  }

  public void setData(Data data) {
    this.data = data;
  }

  public OrderCreated metadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }
  

  public Metadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreated orderCreated = (OrderCreated) o;
    return Objects.equals(this.data, orderCreated.data) &&
        Objects.equals(this.metadata, orderCreated.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreated {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
