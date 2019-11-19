package org.orion.factory.simple;

import java.math.BigDecimal;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-05
 * @since JDK1.8
 */
public class SimpleFactoryTest {

  public static void main(String[] args) {
    BigDecimal inputA = BigDecimal.TEN;
    BigDecimal inputB = BigDecimal.TEN;
    Operator inputO = Operator.SQART;
    BigDecimal res;
    OperationImpl operation;
    try {
      //开方
      operation = OperationFactory.cal(inputO);
      operation.setNumA(inputA);
      res = operation.calculate();
      System.out.println(res);

      //加
      inputO = Operator.ADD;
      operation = OperationFactory.cal(inputO);
      operation.setNumA(inputA);
      operation.setNumB(inputB);
      res = operation.calculate();
      System.out.println(res);

      //减
      inputO = Operator.SUB;
      operation = OperationFactory.cal(inputO);
      operation.setNumA(inputA);
      operation.setNumB(inputB);
      res = operation.calculate();
      System.out.println(res);

      //除
      inputO = Operator.DIV;
      operation = OperationFactory.cal(inputO);
      operation.setNumA(inputA);
      operation.setNumB(inputB);
      res = operation.calculate();
      System.out.println(res);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
