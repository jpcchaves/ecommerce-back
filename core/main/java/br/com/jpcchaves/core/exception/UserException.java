package br.com.jpcchaves.core.exception;

import br.com.jpcchaves.core.exception.enums.ExceptionDefinition;

public class UserException extends BaseException {

  public UserException(String code, int httpStatus) {
    super(code, httpStatus);
  }

  public UserException(ExceptionDefinition exceptionDefinition) {
    super(exceptionDefinition);
  }
}
