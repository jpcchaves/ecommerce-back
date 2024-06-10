package com.cleanarch.application.auth.gateway;

import com.ecommerce.core.dto.auth.LoginRequestDTO;
import com.ecommerce.core.dto.auth.LoginResponseDTO;

public interface LoginGateway {
  LoginResponseDTO login(LoginRequestDTO requestDTO);
}
