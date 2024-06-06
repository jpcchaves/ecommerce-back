package com.ecommerce.core.exception;

import com.ecommerce.core.exception.enums.ExceptionDefinition;

public class RoleException extends BaseException {

  public RoleException(String code, int httpStatus) {
    super(code, httpStatus);
  }

  public RoleException(ExceptionDefinition exceptionDefinition) {
    super(exceptionDefinition);
  }
}
