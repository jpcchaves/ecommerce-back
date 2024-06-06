package com.ecommerce.core.exception;

import com.ecommerce.core.exception.enums.ExceptionDefinition;

public class ProductException extends BaseException {

  public ProductException(String code, int httpStatus) {
    super(code, httpStatus);
  }

  public ProductException(String message, String code, int httpStatus) {
    super(message, code, httpStatus);
  }

  public ProductException(ExceptionDefinition exceptionDefinition) {
    super(exceptionDefinition);
  }
}
