package br.com.jpcchaves.core.validation;

import br.com.jpcchaves.core.domain.Role;
import br.com.jpcchaves.core.exception.RoleException;
import br.com.jpcchaves.core.exception.enums.ExceptionDefinition;

public class RoleValidator implements Validator<Role> {

  @Override
  public void validate(Role entity) {

    if(entity.getName().isBlank()) {

      throw new RoleException(ExceptionDefinition.ROL0001);

    }
  }
}
