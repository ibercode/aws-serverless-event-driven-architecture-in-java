package com.ibercode.orderCancellationService.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Objects;

public class Metadata implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("correlationId")
  private String correlationId = null;

  public Metadata correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }
  

  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metadata metadata = (Metadata) o;
    return Objects.equals(this.correlationId, metadata.correlationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metadata {\n");
    
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
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
