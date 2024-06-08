package com.ecommerce.core.dto.auth;

import com.ecommerce.core.dto.user.UserMinDTO;

public class LoginResponseDTO {
  private String token;
  private UserMinDTO user;

  public LoginResponseDTO() {}

  public LoginResponseDTO(String token, UserMinDTO user) {
    this.token = token;
    this.user = user;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public UserMinDTO getUser() {
    return user;
  }

  public void setUser(UserMinDTO user) {
    this.user = user;
  }
}
