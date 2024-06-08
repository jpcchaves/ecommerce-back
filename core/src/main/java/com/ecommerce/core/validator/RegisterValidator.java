package com.ecommerce.core.validator;

import com.ecommerce.core.dto.auth.UserRegisterDTO;

public class RegisterValidator implements Validator<UserRegisterDTO> {

  @Override
  public void validate(UserRegisterDTO entity) {
    String email = entity.getEmail();
    String username = entity.getUsername();
    String password = entity.getPassword();
    String confirmPassword = entity.getConfirmPassword();
    String firstName = entity.getFirstName();
    String lastName = entity.getLastName();
  }
}
