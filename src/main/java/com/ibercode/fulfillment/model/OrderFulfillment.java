package com.ibercode.fulfillment.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Objects;

public class OrderFulfillment implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("data")
  private Data data = null;

  @JsonProperty("metadata")
  private Metadata metadata = null;

  public OrderFulfillment data(Data data) {
    this.data = data;
    return this;
  }
  

  public Data getData() {
    return data;
  }

  public void setData(Data data) {
    this.data = data;
  }

  public OrderFulfillment metadata(Metadata metadata) {
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
    OrderFulfillment orderFulfillment = (OrderFulfillment) o;
    return Objects.equals(this.data, orderFulfillment.data) &&
        Objects.equals(this.metadata, orderFulfillment.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderFulfillment {\n");
    
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
