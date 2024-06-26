package com.ecommerce.core.exception;

import com.ecommerce.core.exception.enums.ExceptionDefinition;

public class BadRequestException extends BaseException {

  public BadRequestException(String code, int httpStatus) {
    super(code, httpStatus);
  }

  public BadRequestException(String message, String code, int httpStatus) {
    super(message, code, httpStatus);
  }

  public BadRequestException(ExceptionDefinition exceptionDefinition) {
    super(exceptionDefinition);
  }
}
