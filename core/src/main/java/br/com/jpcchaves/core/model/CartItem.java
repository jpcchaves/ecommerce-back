package br.com.jpcchaves.core.model;

import java.util.Objects;

public class CartItem {
  private Long id;
  private User user;
  private Product product;
  private Integer quantity;

  public CartItem() {
  }

  public CartItem(Long id, User user, Product product, Integer quantity) {
    this.id = id;
    this.user = user;
    this.product = product;
    this.quantity = quantity;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
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

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;

    CartItem cartItem = (CartItem) o;

    if (!id.equals(cartItem.id))
      return false;
    if (!Objects.equals(user, cartItem.user))
      return false;
    if (!Objects.equals(product, cartItem.product))
      return false;
    return Objects.equals(quantity, cartItem.quantity);
  }

  @Override
  public int hashCode() {
    int result = id.hashCode();
    result = 31 * result + (user != null ? user.hashCode() : 0);
    result = 31 * result + (product != null ? product.hashCode() : 0);
    result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
    return result;
  }
}
