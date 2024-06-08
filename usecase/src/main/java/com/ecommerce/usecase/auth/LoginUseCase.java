package com.ecommerce.usecase.auth;

import com.ecommerce.core.dto.auth.LoginRequestDTO;
import com.ecommerce.core.dto.auth.LoginResponseDTO;

public interface LoginUseCase {
  LoginResponseDTO login(LoginRequestDTO request);
}
