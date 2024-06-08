package com.ecommerce.core.model;

import java.time.LocalDateTime;

public class User extends Auditable<Long> {

  private Long id;
  private String username;
  private String email;
  private String firstName;
  private String lastName;
  private String password;
  private Role role;
  private boolean isActive;

  public User(
    LocalDateTime createdDate,
    LocalDateTime lastModifiedDate,
    String username,
    String email,
    String firstName,
    String lastName,
    String password,
    Role role,
    boolean isActive
  ) {
    super(createdDate, lastModifiedDate);
    this.username = username;
    this.email = email;
    this.firstName = firstName;
    this.lastName = lastName;
    this.password = password;
    this.role = role;
    this.isActive = isActive;
  }

  public User(
    LocalDateTime createdDate,
    LocalDateTime lastModifiedDate,
    Long id,
    String username,
    String email,
    String firstName,
    String lastName,
    String password,
    Role role,
    boolean isActive
  ) {
    super(createdDate, lastModifiedDate);
    this.id = id;
    this.username = username;
    this.email = email;
    this.firstName = firstName;
    this.lastName = lastName;
    this.password = password;
    this.role = role;
    this.isActive = isActive;
  }

  public User(
    Long id,
    String username,
    String email,
    String firstName,
    String lastName,
    String password,
    Role role,
    boolean isActive
  ) {
    this.id = id;
    this.username = username;
    this.email = email;
    this.firstName = firstName;
    this.lastName = lastName;
    this.password = password;
    this.role = role;
    this.isActive = isActive;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean active) {
    isActive = active;
  }
}
