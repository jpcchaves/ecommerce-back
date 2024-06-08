package com.ecommerce.core.validator;

import com.ecommerce.core.exception.ValidationException;
import com.ecommerce.core.exception.enums.ExceptionDefinition;
import com.ecommerce.core.model.Role;

public class RoleValidator implements Validator<Role> {

  @Override
  public void validate(Role entity) {
    if (entity.getName().isBlank()) {
      throw new ValidationException(ExceptionDefinition.VAL0004);
    }
  }
}
