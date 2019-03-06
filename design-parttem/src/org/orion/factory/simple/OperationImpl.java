package org.orion.factory.simple;

import java.math.BigDecimal;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-04
 * @since JDK1.8
 */
public class OperationImpl implements Operation {
  private BigDecimal numA;
  private BigDecimal numB;

  public BigDecimal getNumA() {
    return numA;
  }

  public void setNumA(BigDecimal numA) {
    this.numA = numA;
  }

  public BigDecimal getNumB() {
    return numB;
  }

  public void setNumB(BigDecimal numB) {
    this.numB = numB;
  }

  @Override public BigDecimal calculate() throws Exception {
    BigDecimal res = BigDecimal.ZERO;
    return res;
  }

}
