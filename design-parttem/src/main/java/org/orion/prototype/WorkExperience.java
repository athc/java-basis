package org.orion.prototype;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-07
 * @since JDK1.8
 */
public class WorkExperience implements Cloneable {

  private String company;

  private String date;

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  @Override protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
