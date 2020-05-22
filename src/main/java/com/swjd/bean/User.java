package com.swjd.bean;


public class User {

  private long uid;
  private String uname;
  private String realname;
  private String password;
  private long flag;

  public User(long uid, String uname, String realname, String password, long flag) {
    this.uid = uid;
    this.uname = uname;
    this.realname = realname;
    this.password = password;
    this.flag = flag;
  }

  public User() {


  }

  @Override
  public String toString() {
    return "User{" +
            "uid=" + uid +
            ", uname='" + uname + '\'' +
            ", realname='" + realname + '\'' +
            ", password='" + password + '\'' +
            ", flag=" + flag +
            '}';
  }

  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }


  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public long getFlag() {
    return flag;
  }

  public void setFlag(long flag) {
    this.flag = flag;
  }

}
