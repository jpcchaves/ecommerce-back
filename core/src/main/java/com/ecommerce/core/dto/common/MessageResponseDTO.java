package com.ecommerce.core.dto.common;

public class MessageResponseDTO {
  private String message;

  private MessageResponseDTO(String message) {
    this.message = message;
  }

  public static MessageResponseDTO message(String message) {
    return new MessageResponseDTO(message);
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "MessageResponseDTO{" + "message='" + message + '\'' + '}';
  }
}
