package com.ecommerce.usecase.auth;

import com.ecommerce.core.dto.auth.UserRegisterDTO;
import com.ecommerce.core.dto.common.MessageResponseDTO;

public interface UserRegisterUseCase {
  MessageResponseDTO register(UserRegisterDTO request);
}
