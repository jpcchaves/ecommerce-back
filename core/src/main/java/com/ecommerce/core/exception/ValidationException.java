package com.ecommerce.core.exception;

import com.ecommerce.core.exception.enums.ExceptionDefinition;

public class ValidationException extends BaseException {

  public ValidationException(String code, int httpStatus) {
    super(code, httpStatus);
  }

  public ValidationException(String message, String code, int httpStatus) {
    super(message, code, httpStatus);
  }

  public ValidationException(ExceptionDefinition exceptionDefinition) {
    super(exceptionDefinition);
  }
}
