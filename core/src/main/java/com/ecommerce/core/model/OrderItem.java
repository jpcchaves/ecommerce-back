package com.ecommerce.core.model;

import java.math.BigDecimal;
import java.util.Objects;

public class OrderItem {
  private Long id;
  private Order order;
  private Product product;
  private Integer quantity;
  private BigDecimal price;

  public OrderItem() {}

  public OrderItem(Long id, Order order, Product product, Integer quantity, BigDecimal price) {
    this.id = id;
    this.order = order;
    this.product = product;
    this.quantity = quantity;
    this.price = price;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    OrderItem orderItem = (OrderItem) o;

    if (!id.equals(orderItem.id)) return false;
    if (!Objects.equals(product, orderItem.product)) return false;
    if (!Objects.equals(quantity, orderItem.quantity)) return false;
    return Objects.equals(price, orderItem.price);
  }

  @Override
  public int hashCode() {
    int result = id.hashCode();
    result = 31 * result + (product != null ? product.hashCode() : 0);
    result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
    result = 31 * result + (price != null ? price.hashCode() : 0);
    return result;
  }

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }
}
