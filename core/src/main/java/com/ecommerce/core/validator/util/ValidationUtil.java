package com.ecommerce.core.validator.util;

import com.ecommerce.core.exception.ValidationException;
import com.ecommerce.core.exception.enums.ExceptionDefinition;
import com.ecommerce.core.validator.util.helper.EmailValidatorHelper;

public class ValidationUtil {

  public static void notBlank(String value, String fieldName) {
    if (value == null || value.isBlank()) {
      throw new ValidationException(
        ExceptionDefinition.notNullErrorMessage(fieldName),
        ExceptionDefinition.VAL0002.getCode(),
        ExceptionDefinition.VAL0002.getHttpStatus()
      );
    }
  }

  public static boolean isEmailValid(String email) {
    return EmailValidatorHelper.isValid(email);
  }
}
