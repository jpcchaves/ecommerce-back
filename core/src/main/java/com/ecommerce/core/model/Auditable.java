package com.ecommerce.core.model;

import java.time.LocalDateTime;

public abstract class Auditable<PK> {
  protected PK createdBy;
  protected PK lastModifiedBy;
  protected LocalDateTime createdDate;
  protected LocalDateTime lastModifiedDate;

  public Auditable() {}

  public Auditable(LocalDateTime createdDate, LocalDateTime lastModifiedDate) {
    this.createdDate = createdDate;
    this.lastModifiedDate = lastModifiedDate;
  }

  public Auditable(PK lastModifiedBy, LocalDateTime createdDate, LocalDateTime lastModifiedDate) {
    this.lastModifiedBy = lastModifiedBy;
    this.createdDate = createdDate;
    this.lastModifiedDate = lastModifiedDate;
  }

  public Auditable(
      PK createdBy, PK lastModifiedBy, LocalDateTime createdDate, LocalDateTime lastModifiedDate) {
    this.createdBy = createdBy;
    this.lastModifiedBy = lastModifiedBy;
    this.createdDate = createdDate;
    this.lastModifiedDate = lastModifiedDate;
  }

  public PK getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(PK createdBy) {
    this.createdBy = createdBy;
  }

  public PK getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(PK lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public LocalDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public LocalDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }
}
