package org.orion.factory.simple;

import java.math.BigDecimal;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-04
 * @since JDK1.8
 */
public class AddOperation extends OperationImpl {

  @Override public BigDecimal calculate() {
    return getNumA().add(getNumB());
  }

  @Override public BigDecimal getNumA() {
    return super.getNumA();
  }

  @Override public void setNumA(BigDecimal numA) {
    super.setNumA(numA);
  }

  @Override public BigDecimal getNumB() {
    return super.getNumB();
  }

  @Override public void setNumB(BigDecimal numB) {
    super.setNumB(numB);
  }
}
