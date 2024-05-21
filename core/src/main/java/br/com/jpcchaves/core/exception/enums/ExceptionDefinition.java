package br.com.jpcchaves.core.exception.enums;

public enum ExceptionDefinition {
  USR0001("The field must have less than 50 characters", "TD-0001", HttpStatus.BAD_REQUEST.value());
  private final String message;
  private final String code;
  private final int httpStatus;

  ExceptionDefinition(String message, String code, int httpStatus) {
    this.message = message;
    this.code = code;
    this.httpStatus = httpStatus;
  }

  public String getMessage() {
    return message;
  }

  public String getCode() {
    return code;
  }

  public int getHttpStatus() {
    return httpStatus;
  }
}
