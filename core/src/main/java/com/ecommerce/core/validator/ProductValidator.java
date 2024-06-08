package com.ecommerce.core.validator;

import com.ecommerce.core.model.Product;
import com.ecommerce.core.validator.util.ValidationUtil;

public class ProductValidator implements Validator<Product> {

  private static ProductValidator INSTANCE = new ProductValidator();

  private ProductValidator() {}

  public static ProductValidator getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new ProductValidator();
    }

    return INSTANCE;
  }

  @Override
  public void validate(Product product) {
    ValidationUtil.notBlank(product.getName(), "name");
    ValidationUtil.notBlank(product.getDescription(), "description");
  }
}
