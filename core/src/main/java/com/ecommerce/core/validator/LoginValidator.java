package com.ecommerce.core.validator;

import com.ecommerce.core.dto.auth.LoginRequestDTO;
import com.ecommerce.core.exception.ValidationException;
import com.ecommerce.core.exception.enums.ExceptionDefinition;
import com.ecommerce.core.exception.enums.HttpStatus;
import com.ecommerce.core.validator.util.ValidationUtil;

public class LoginValidator implements Validator<LoginRequestDTO> {

  private static LoginValidator INSTANCE;

  private LoginValidator() {}

  public static LoginValidator getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new LoginValidator();
    }

    return INSTANCE;
  }

  @Override
  public void validate(LoginRequestDTO entity) {
    String email = entity.getEmail();
    String password = entity.getPassword();

    if (!ValidationUtil.isEmailValid(email)) {
      throw new ValidationException(ExceptionDefinition.VAL0001);
    }

    if (password.isBlank()) {
      throw new ValidationException(
        ExceptionDefinition.notNullErrorMessage("password"),
        "VAL-0002",
        HttpStatus.BAD_REQUEST.value()
      );
    }

    if (password.length() <= 8) {
      throw new ValidationException(ExceptionDefinition.VAL0003);
    }
  }
}
