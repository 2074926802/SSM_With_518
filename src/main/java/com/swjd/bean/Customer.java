package com.swjd.bean;


import java.sql.Date;

public class Customer {

  //表示客户负责人的真实姓名
  private String customerUserName;
  //客户来源(中文)
  private String customerSourceChinese;
  //所属行业(中文)
  private String customerIndustryChinese;
  private long customerId;
  private String customerName;
  private String customerUserId;
  private String customerCreateId;
  private String customerSourse;
  private String customerIndustry;
  private String customerPhone;
  private String customerAddress;
  private java.sql.Date customerDate;

  public Customer(String customerUserName, String customerSourceChinese, String customerIndustryChinese, long customerId, String customerName, String customerUserId, String customerCreateId, String customerSourse, String customerIndustry, String customerPhone, String customerAddress, Date customerDate) {
    this.customerUserName = customerUserName;
    this.customerSourceChinese = customerSourceChinese;
    this.customerIndustryChinese = customerIndustryChinese;
    this.customerId = customerId;
    this.customerName = customerName;
    this.customerUserId = customerUserId;
    this.customerCreateId = customerCreateId;
    this.customerSourse = customerSourse;
    this.customerIndustry = customerIndustry;
    this.customerPhone = customerPhone;
    this.customerAddress = customerAddress;
    this.customerDate = customerDate;
  }

  public Customer() {
  }

  @Override
  public String toString() {
    return "Customer{" +
            "customerUserName='" + customerUserName + '\'' +
            ", customerSourceChinese='" + customerSourceChinese + '\'' +
            ", customerIndustryChinese='" + customerIndustryChinese + '\'' +
            ", customerId=" + customerId +
            ", customerName='" + customerName + '\'' +
            ", customerUserId='" + customerUserId + '\'' +
            ", customerCreateId='" + customerCreateId + '\'' +
            ", customerSourse='" + customerSourse + '\'' +
            ", customerIndustry='" + customerIndustry + '\'' +
            ", customerPhone='" + customerPhone + '\'' +
            ", customerAddress='" + customerAddress + '\'' +
            ", customerDate=" + customerDate +
            '}';
  }

  public String getCustomerUserName() {
    return customerUserName;
  }

  public void setCustomerUserName(String customerUserName) {
    this.customerUserName = customerUserName;
  }

  public String getCustomerSourceChinese() {
    return customerSourceChinese;
  }

  public void setCustomerSourceChinese(String customerSourceChinese) {
    this.customerSourceChinese = customerSourceChinese;
  }

  public String getCustomerIndustryChinese() {
    return customerIndustryChinese;
  }

  public void setCustomerIndustryChinese(String customerIndustryChinese) {
    this.customerIndustryChinese = customerIndustryChinese;
  }

  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getCustomerUserId() {
    return customerUserId;
  }

  public void setCustomerUserId(String customerUserId) {
    this.customerUserId = customerUserId;
  }

  public String getCustomerCreateId() {
    return customerCreateId;
  }

  public void setCustomerCreateId(String customerCreateId) {
    this.customerCreateId = customerCreateId;
  }

  public String getCustomerSourse() {
    return customerSourse;
  }

  public void setCustomerSourse(String customerSourse) {
    this.customerSourse = customerSourse;
  }

  public String getCustomerIndustry() {
    return customerIndustry;
  }

  public void setCustomerIndustry(String customerIndustry) {
    this.customerIndustry = customerIndustry;
  }

  public String getCustomerPhone() {
    return customerPhone;
  }

  public void setCustomerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
  }

  public String getCustomerAddress() {
    return customerAddress;
  }

  public void setCustomerAddress(String customerAddress) {
    this.customerAddress = customerAddress;
  }

  public Date getCustomerDate() {
    return customerDate;
  }

  public void setCustomerDate(Date customerDate) {
    this.customerDate = customerDate;
  }
}
