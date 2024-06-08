package com.ecommerce.core.validator;

import com.ecommerce.core.dto.auth.LoginRequestDTO;
import com.ecommerce.core.exception.BadRequestException;
import com.ecommerce.core.exception.enums.ExceptionDefinition;
import com.ecommerce.core.exception.enums.HttpStatus;
import com.ecommerce.core.validator.util.ValidationUtil;

public class LoginValidator implements Validator<LoginRequestDTO> {

  @Override
  public void validate(LoginRequestDTO entity) {
    String email = entity.getEmail();
    String password = entity.getPassword();

    if (!ValidationUtil.isEmailValid(email)) {
      throw new BadRequestException(ExceptionDefinition.VAL0001);
    }

    if (password.isBlank()) {
      throw new BadRequestException(
        ExceptionDefinition.notNullErrorMessage("password"),
        "VAL-0002",
        HttpStatus.BAD_REQUEST.value()
      );
    }

    if (password.length() <= 8) {
      throw new BadRequestException(ExceptionDefinition.VAL0003);
    }
  }
}
