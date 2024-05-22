package br.com.jpcchaves.core.model;

import java.util.Objects;

public class ProductCategory {
  private Long id;
  private String name;

  public ProductCategory() {
  }

  public ProductCategory(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;

    ProductCategory that = (ProductCategory) o;

    if (!id.equals(that.id))
      return false;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    int result = id.hashCode();
    result = 31 * result + (name != null ? name.hashCode() : 0);
    return result;
  }
}
