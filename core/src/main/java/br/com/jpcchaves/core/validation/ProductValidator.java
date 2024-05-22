package br.com.jpcchaves.core.validation;

import br.com.jpcchaves.core.model.Product;

public class ProductValidator implements Validator<Product> {
  @Override
  public void validate(Product product) {
    ValidationUtil.notBlank(product.getName(), "name");
    ValidationUtil.notBlank(product.getDescription(), "description");


  }
}
