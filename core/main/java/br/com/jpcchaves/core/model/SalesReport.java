package br.com.jpcchaves.core.model;

import java.util.Date;

public class SalesReport {
  private Long id;
  private Date startDate;
  private Date endDate;
  private int productsSold;
  private String filePath;

  public SalesReport() {}

  public SalesReport(Long id, Date startDate, Date endDate, int productsSold, String filePath) {
    this.id = id;
    this.startDate = startDate;
    this.endDate = endDate;
    this.productsSold = productsSold;
    this.filePath = filePath;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public int getProductsSold() {
    return productsSold;
  }

  public void setProductsSold(int productsSold) {
    this.productsSold = productsSold;
  }

  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }
}
