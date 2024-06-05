package br.com.jpcchaves.core.validation;

@FunctionalInterface
public interface Validator<T> {
  void validate(T entity);
}
