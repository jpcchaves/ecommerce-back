package com.ecommerce.core.validation;

import com.ecommerce.core.model.Product;

public class ProductValidator implements Validator<Product> {

  @Override
  public void validate(Product product) {
    ValidationUtil.notBlank(product.getName(), "name");
    ValidationUtil.notBlank(product.getDescription(), "description");
  }
}
