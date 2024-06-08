package com.ecommerce.core.validation;

import com.ecommerce.core.exception.BadRequestException;
import com.ecommerce.core.exception.enums.ExceptionDefinition;

public class ValidationUtil {

  public static void notBlank(String value, String fieldName) {
    if (value == null || value.isBlank()) {
      throw new BadRequestException(
        ExceptionDefinition.notNullErrorMessage(fieldName),
        ExceptionDefinition.GEN0002.getCode(),
        ExceptionDefinition.GEN0002.getHttpStatus()
      );
    }
  }

  public static boolean isEmailValid(String email) {
    return EmailValidator.isValid(email);
  }
}
