package com.ibercode.orderCancellationService.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Objects;

public class OrderCancellation implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("data")
  private Data data = null;

  @JsonProperty("metadata")
  private Metadata metadata = null;

  public OrderCancellation data(Data data) {
    this.data = data;
    return this;
  }
  

  public Data getData() {
    return data;
  }

  public void setData(Data data) {
    this.data = data;
  }

  public OrderCancellation metadata(Metadata metadata) {
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
    OrderCancellation orderCancellation = (OrderCancellation) o;
    return Objects.equals(this.data, orderCancellation.data) &&
        Objects.equals(this.metadata, orderCancellation.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCancellation {\n");
    
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
