package com.ecommerce.core.validator.util;

import com.ecommerce.core.exception.BadRequestException;
import com.ecommerce.core.exception.enums.ExceptionDefinition;
import com.ecommerce.core.validator.util.helper.EmailValidatorHelper;

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
    return EmailValidatorHelper.isValid(email);
  }
}
