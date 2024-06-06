package com.ecommerce.core.validation;

import com.ecommerce.core.exception.RoleException;
import com.ecommerce.core.exception.enums.ExceptionDefinition;
import com.ecommerce.core.model.Role;

public class RoleValidator implements Validator<Role> {

  @Override
  public void validate(Role entity) {

    if (entity.getName().isBlank()) {

      throw new RoleException(ExceptionDefinition.ROL0001);
    }
  }
}
