package com.ecommerce.core.exception.enums;

public enum ExceptionDefinition {
  USR0001(
    "The field must have less than 50 characters",
    "TD-0001",
    HttpStatus.BAD_REQUEST.value()
  ),
  USR0002(
    "The field cannot be empty or null",
    "USR-0002",
    HttpStatus.BAD_REQUEST.value()
  ),
  USR0003(
    "The password must contain 8 or more characters",
    "USR-0003",
    HttpStatus.BAD_REQUEST.value()
  ),
  USR0004("User cannot be null!", "USR-0004", HttpStatus.BAD_REQUEST.value()),
  GEN0001(
    "Empty or invalid email!",
    "GEN-0001",
    HttpStatus.BAD_REQUEST.value()
  ),
  GEN0002(
    "The field %s cannot be empty or null",
    "GEN-0002",
    HttpStatus.BAD_REQUEST.value()
  ),
  GEN0003(
    "The password must contain at least 8 characters",
    "GEN-0003",
    HttpStatus.BAD_REQUEST.value()
  ),
  ROL0001(
    "The role name cannot be empty or null!",
    "GEN-0001",
    HttpStatus.BAD_REQUEST.value()
  );

  private final String message;
  private final String code;
  private final int httpStatus;

  ExceptionDefinition(String message, String code, int httpStatus) {
    this.message = message;
    this.code = code;
    this.httpStatus = httpStatus;
  }

  public static String notNullErrorMessage(String fieldName) {
    return String.format(GEN0002.message, fieldName);
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
