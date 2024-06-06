package com.ecommerce.core.model;

import com.ecommerce.core.model.Enum.ClientStatus;
import java.time.LocalDateTime;
import java.util.Objects;

public class Client extends Auditable<Long> {
  private Long id;
  private User user;
  private String fullName;
  private String contact;
  private String address;
  private ClientStatus status = ClientStatus.ACTIVE;

  public Client() {}

  public Client(
      Long id, User user, String fullName, String contact, String address, ClientStatus status) {
    this.id = id;
    this.user = user;
    this.fullName = fullName;
    this.contact = contact;
    this.address = address;
    this.status = status;
  }

  public Client(
      LocalDateTime createdDate,
      LocalDateTime lastModifiedDate,
      Long id,
      User user,
      String fullName,
      String contact,
      String address,
      ClientStatus status) {
    super(createdDate, lastModifiedDate);
    this.id = id;
    this.user = user;
    this.fullName = fullName;
    this.contact = contact;
    this.address = address;
    this.status = status;
  }

  public Client(
      Long createdBy,
      Long lastModifiedBy,
      LocalDateTime createdDate,
      LocalDateTime lastModifiedDate,
      Long id,
      User user,
      String fullName,
      String contact,
      String address,
      ClientStatus status) {
    super(createdBy, lastModifiedBy, createdDate, lastModifiedDate);
    this.id = id;
    this.user = user;
    this.fullName = fullName;
    this.contact = contact;
    this.address = address;
    this.status = status;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public ClientStatus getStatus() {
    return status;
  }

  public void setStatus(ClientStatus status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Client client = (Client) o;

    if (!id.equals(client.id)) return false;
    if (!Objects.equals(user, client.user)) return false;
    if (!Objects.equals(fullName, client.fullName)) return false;
    if (!Objects.equals(contact, client.contact)) return false;
    if (!Objects.equals(address, client.address)) return false;
    return status == client.status;
  }

  @Override
  public int hashCode() {
    int result = id.hashCode();
    result = 31 * result + (user != null ? user.hashCode() : 0);
    result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
    result = 31 * result + (contact != null ? contact.hashCode() : 0);
    result = 31 * result + (address != null ? address.hashCode() : 0);
    result = 31 * result + (status != null ? status.hashCode() : 0);
    return result;
  }
}
