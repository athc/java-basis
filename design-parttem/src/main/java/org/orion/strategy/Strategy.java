package org.orion.strategy;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-05
 * @since JDK1.8
 */
public enum Strategy {

  NOMAL("1", "原价"),
  CASH9ON("0.9", "打折"),
  REBATE("", "没满200反100");

  private String strategy;

  private String remark;

  Strategy(String strategy, String remark) {
    this.strategy = strategy;
    this.remark = remark;
  }

  public String getStrategy() {
    return strategy;
  }

  public void setStrategy(String strategy) {
    this.strategy = strategy;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }}
