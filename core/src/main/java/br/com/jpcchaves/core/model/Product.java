package br.com.jpcchaves.core.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class Product extends Auditable<Long> {
  private UUID id;
  private String name;
  private String description;
  private String shortDescription;
  private BigDecimal price;
  private ProductCategory category;
  private Integer stock;

  public Product() {}

  public Product(
      UUID id,
      String name,
      String description,
      String shortDescription,
      BigDecimal price,
      ProductCategory category,
      Integer stock) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.shortDescription = shortDescription;
    this.price = price;
    this.category = category;
    this.stock = stock;
  }

  public Product(
      LocalDateTime createdDate,
      LocalDateTime lastModifiedDate,
      UUID id,
      String name,
      String description,
      String shortDescription,
      BigDecimal price,
      ProductCategory category,
      Integer stock) {
    super(createdDate, lastModifiedDate);
    this.id = id;
    this.name = name;
    this.description = description;
    this.shortDescription = shortDescription;
    this.price = price;
    this.category = category;
    this.stock = stock;
  }

  public Product(
      Long createdBy,
      Long lastModifiedBy,
      LocalDateTime createdDate,
      LocalDateTime lastModifiedDate,
      UUID id,
      String name,
      String description,
      String shortDescription,
      BigDecimal price,
      ProductCategory category,
      Integer stock) {
    super(createdBy, lastModifiedBy, createdDate, lastModifiedDate);
    this.id = id;
    this.name = name;
    this.description = description;
    this.shortDescription = shortDescription;
    this.price = price;
    this.category = category;
    this.stock = stock;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public ProductCategory getCategory() {
    return category;
  }

  public void setCategory(ProductCategory category) {
    this.category = category;
  }

  public Integer getStock() {
    return stock;
  }

  public void setStock(Integer stock) {
    this.stock = stock;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Product product = (Product) o;

    if (!id.equals(product.id)) return false;
    if (!Objects.equals(name, product.name)) return false;
    if (!Objects.equals(description, product.description)) return false;
    if (!Objects.equals(shortDescription, product.shortDescription)) return false;
    if (!Objects.equals(price, product.price)) return false;
    if (!Objects.equals(category, product.category)) return false;
    return Objects.equals(stock, product.stock);
  }

  @Override
  public int hashCode() {
    int result = id.hashCode();
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (description != null ? description.hashCode() : 0);
    result = 31 * result + (shortDescription != null ? shortDescription.hashCode() : 0);
    result = 31 * result + (price != null ? price.hashCode() : 0);
    result = 31 * result + (category != null ? category.hashCode() : 0);
    result = 31 * result + (stock != null ? stock.hashCode() : 0);
    return result;
  }
}
