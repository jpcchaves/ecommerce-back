package br.com.jpcchaves.core.validation;

import br.com.jpcchaves.core.exception.BadRequestException;
import br.com.jpcchaves.core.exception.enums.ExceptionDefinition;

public class ValidationUtil {
  public static void notBlank(String value, String fieldName) {
    if (value == null || value.isBlank()) {
      throw new BadRequestException(ExceptionDefinition.notNullErrorMessage(fieldName), ExceptionDefinition.GEN0002.getCode(), ExceptionDefinition.GEN0002.getHttpStatus());
    }
  }
}
