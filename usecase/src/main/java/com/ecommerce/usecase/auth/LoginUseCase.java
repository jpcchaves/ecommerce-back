package com.ecommerce.usecase.auth;

import com.ecommerce.core.dto.auth.LoginRequestDTO;
import com.ecommerce.core.dto.common.MessageResponseDTO;

public interface LoginUseCase {
  MessageResponseDTO login(LoginRequestDTO request);
}
