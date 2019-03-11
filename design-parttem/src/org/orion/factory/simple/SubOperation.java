package org.orion.factory.simple;

import java.math.BigDecimal;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-04
 * @since JDK1.8
 */
public class SubOperation extends OperationImpl {
  @Override public BigDecimal calculate() {
    return getNumA().subtract(getNumB());
  }
}
