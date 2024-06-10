package com.ecommerce.core.validator;

@FunctionalInterface
public interface Validator<T> {
  void validate(T entity);
}
