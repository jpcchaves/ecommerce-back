package br.com.jpcchaves.core.model;

import br.com.jpcchaves.core.model.Enum.OrderStatus;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Order {
  private UUID id;
  private User client;
  private LocalDateTime orderDate;
  private OrderStatus status = OrderStatus.RECEIVED;
  private List<OrderItem> orderItems = new ArrayList<>();

  public Order() {}

  public Order(
      UUID id,
      User client,
      LocalDateTime orderDate,
      OrderStatus status,
      List<OrderItem> orderItems) {
    this.id = id;
    this.client = client;
    this.orderDate = orderDate;
    this.status = status;
    this.orderItems = orderItems;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public User getClient() {
    return client;
  }

  public void setClient(User client) {
    this.client = client;
  }

  public LocalDateTime getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(LocalDateTime orderDate) {
    this.orderDate = orderDate;
  }

  public OrderStatus getStatus() {
    return status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  public List<OrderItem> getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(List<OrderItem> orderItems) {
    this.orderItems = orderItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Order order = (Order) o;

    if (!id.equals(order.id)) return false;
    if (!Objects.equals(client, order.client)) return false;
    if (!Objects.equals(orderDate, order.orderDate)) return false;
    if (status != order.status) return false;
    return Objects.equals(orderItems, order.orderItems);
  }

  @Override
  public int hashCode() {
    int result = id.hashCode();
    result = 31 * result + (client != null ? client.hashCode() : 0);
    result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
    result = 31 * result + (status != null ? status.hashCode() : 0);
    result = 31 * result + (orderItems != null ? orderItems.hashCode() : 0);
    return result;
  }
}
