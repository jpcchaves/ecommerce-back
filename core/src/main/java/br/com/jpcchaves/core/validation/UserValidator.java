package br.com.jpcchaves.core.validation;

import br.com.jpcchaves.core.model.User;
import br.com.jpcchaves.core.exception.UserException;
import br.com.jpcchaves.core.exception.enums.ExceptionDefinition;

public class UserValidator implements Validator<User> {
  private static final int MAX_LENGTH = 50;
  private static final int MIN_PASSWORD_LENGTH = 8;


  @Override
  public void validate(User entity) {
    if (entity == null) {
      throw new UserException(ExceptionDefinition.USR0004);
    }

    validateNotBlank(entity.getUsername());
    validateNotBlank(entity.getEmail());
    validateNotBlank(entity.getFirstName());
    validateNotBlank(entity.getLastName());
    validateNotBlank(entity.getPassword());

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

  private void validateNotBlank(String value) {
    if (value == null || value.isBlank()) {
      throw new UserException(ExceptionDefinition.USR0001);
    }
  }

  private void validateMaxLength(String value, int maxLength) {
    if (value.length() > maxLength) {
      throw new UserException(ExceptionDefinition.USR0001);
    }
  }
}
