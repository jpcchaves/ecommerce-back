package com.ecommerce.core.validation;

import com.ecommerce.core.exception.UserException;
import com.ecommerce.core.exception.enums.ExceptionDefinition;
import com.ecommerce.core.model.User;

public class UserValidator implements Validator<User> {

  private static final int MAX_LENGTH = 50;
  private static final int MIN_PASSWORD_LENGTH = 8;

  @Override
  public void validate(User entity) {
    if (entity == null) {
      throw new UserException(ExceptionDefinition.USR0004);
    }

    ValidationUtil.notBlank(entity.getUsername(), "username");
    ValidationUtil.notBlank(entity.getEmail(), "email");
    ValidationUtil.notBlank(entity.getFirstName(), "first name");
    ValidationUtil.notBlank(entity.getLastName(), "last name");
    ValidationUtil.notBlank(entity.getPassword(), "password");

    validateMaxLength(entity.getUsername(), MAX_LENGTH);
    validateMaxLength(entity.getFirstName(), MAX_LENGTH);
    validateMaxLength(entity.getLastName(), MAX_LENGTH);

    if (!EmailValidator.isValid(entity.getEmail())) {
      throw new UserException(ExceptionDefinition.GEN0001);
    }

    if (entity.getPassword().length() < MIN_PASSWORD_LENGTH) {
      throw new UserException(ExceptionDefinition.USR0003);
    }
  }

  private void validateMaxLength(String value, int maxLength) {
    if (value.length() > maxLength) {
      throw new UserException(ExceptionDefinition.USR0001);
    }
  }
}
