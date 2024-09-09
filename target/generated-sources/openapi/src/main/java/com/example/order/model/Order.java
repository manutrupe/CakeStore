package com.example.order.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Order
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-08T20:58:44.441422-05:00[America/Mexico_City]", comments = "Generator version: 7.8.0")
public class Order {

  private Long id;

  private Long oderId;

  private String pickUpPoint;

  @Valid
  private List<Object> cakes = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date shipDate;

  /**
   * Order Status
   */
  public enum StatusEnum {
    PLACED("placed"),
    
    APPROVED("approved"),
    
    DELIVERED("delivered");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private Boolean complete;

  public Order() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Order(List<Object> cakes) {
    this.cakes = cakes;
  }

  public Order id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", example = "10", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Order oderId(Long oderId) {
    this.oderId = oderId;
    return this;
  }

  /**
   * Get oderId
   * @return oderId
   */
  
  @Schema(name = "oderId", example = "198772", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oderId")
  public Long getOderId() {
    return oderId;
  }

  public void setOderId(Long oderId) {
    this.oderId = oderId;
  }

  public Order pickUpPoint(String pickUpPoint) {
    this.pickUpPoint = pickUpPoint;
    return this;
  }

  /**
   * Order PickUpPoint
   * @return pickUpPoint
   */
  
  @Schema(name = "PickUpPoint", example = "Plaza Galerias", description = "Order PickUpPoint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PickUpPoint")
  public String getPickUpPoint() {
    return pickUpPoint;
  }

  public void setPickUpPoint(String pickUpPoint) {
    this.pickUpPoint = pickUpPoint;
  }

  public Order cakes(List<Object> cakes) {
    this.cakes = cakes;
    return this;
  }

  public Order addCakesItem(Object cakesItem) {
    if (this.cakes == null) {
      this.cakes = new ArrayList<>();
    }
    this.cakes.add(cakesItem);
    return this;
  }

  /**
   * Get cakes
   * @return cakes
   */
  @NotNull 
  @Schema(name = "Cakes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Cakes")
  public List<Object> getCakes() {
    return cakes;
  }

  public void setCakes(List<Object> cakes) {
    this.cakes = cakes;
  }

  public Order shipDate(Date shipDate) {
    this.shipDate = shipDate;
    return this;
  }

  /**
   * Get shipDate
   * @return shipDate
   */
  @Valid 
  @Schema(name = "shipDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipDate")
  public Date getShipDate() {
    return shipDate;
  }

  public void setShipDate(Date shipDate) {
    this.shipDate = shipDate;
  }

  public Order status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Order Status
   * @return status
   */
  
  @Schema(name = "status", example = "approved", description = "Order Status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Order complete(Boolean complete) {
    this.complete = complete;
    return this;
  }

  /**
   * Get complete
   * @return complete
   */
  
  @Schema(name = "complete", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("complete")
  public Boolean getComplete() {
    return complete;
  }

  public void setComplete(Boolean complete) {
    this.complete = complete;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.oderId, order.oderId) &&
        Objects.equals(this.pickUpPoint, order.pickUpPoint) &&
        Objects.equals(this.cakes, order.cakes) &&
        Objects.equals(this.shipDate, order.shipDate) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.complete, order.complete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, oderId, pickUpPoint, cakes, shipDate, status, complete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    oderId: ").append(toIndentedString(oderId)).append("\n");
    sb.append("    pickUpPoint: ").append(toIndentedString(pickUpPoint)).append("\n");
    sb.append("    cakes: ").append(toIndentedString(cakes)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

