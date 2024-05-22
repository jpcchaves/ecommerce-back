package br.com.jpcchaves.core.exception;

import br.com.jpcchaves.core.exception.BaseException;
import br.com.jpcchaves.core.exception.enums.ExceptionDefinition;

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
