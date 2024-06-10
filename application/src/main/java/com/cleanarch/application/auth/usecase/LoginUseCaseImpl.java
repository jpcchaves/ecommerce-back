package com.cleanarch.application.auth.usecase;

import com.cleanarch.application.auth.gateway.LoginGateway;
import com.ecommerce.core.dto.auth.LoginRequestDTO;
import com.ecommerce.core.dto.auth.LoginResponseDTO;
import com.ecommerce.core.validator.LoginValidator;
import com.ecommerce.usecase.auth.LoginUseCase;

public class LoginUseCaseImpl implements LoginUseCase {

  private final LoginGateway loginGateway;

  public LoginUseCaseImpl(LoginGateway loginGateway) {
    this.loginGateway = loginGateway;
  }

  @Override
  public LoginResponseDTO login(LoginRequestDTO request) {
    LoginValidator.getInstance().validate(request);

    return loginGateway.login(request);
  }
}
