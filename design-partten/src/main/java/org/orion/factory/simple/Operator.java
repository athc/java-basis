package org.orion.factory.simple;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-04
 * @since JDK1.8
 */
public enum Operator {
  ADD("+", "加法"),
  MUL("*", "乘法"),
  DIV("/", "除法"),
  SQART("2", "平方根"),
  SUB("-", "减法");

  private String symbol;

  private String remark;

  Operator(String symbol, String remark) {
    this.symbol = symbol;
    this.remark = remark;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }}
