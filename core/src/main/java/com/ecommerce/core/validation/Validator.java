package com.ecommerce.core.validation;

@FunctionalInterface
public interface Validator<T> {
  void validate(T entity);
}
