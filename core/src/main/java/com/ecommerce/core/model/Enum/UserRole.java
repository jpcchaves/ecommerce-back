package com.ecommerce.core.model.Enum;

public enum UserRole {
  USER_ROLE("USER_ROLE"),
  ADMIN_ROLE("ADMIN_ROLE");

  private final String role;

  UserRole(String role) {
    this.role = role;
  }

  public String fromString(String role) {
    for (UserRole userRole : values()) {
      if (userRole.role.equals(role)) {
        return role;
      }
    }

    throw new IllegalArgumentException("");
  }
}
