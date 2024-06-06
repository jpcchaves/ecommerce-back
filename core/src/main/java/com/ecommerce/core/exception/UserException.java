package com.ecommerce.core.exception;

import com.ecommerce.core.exception.enums.ExceptionDefinition;

public class UserException extends BaseException {

  public UserException(String code, int httpStatus) {
    super(code, httpStatus);
  }

  public UserException(ExceptionDefinition exceptionDefinition) {
    super(exceptionDefinition);
  }
}
