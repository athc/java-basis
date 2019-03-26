package org.orion.factory.simple;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-04
 * @since JDK1.8
 */
public class OperationFactory {

  public static OperationImpl cal(Operator operator) throws Exception {
    switch (operator) {
      case ADD:
        return new AddOperation();
      case SUB:
        return new SubOperation();
      case DIV:
        return new DivOperation();
      case SQART:
        return new SqrtOperation();
      default:
        throw new Exception("error!!!");
    }
  }
}
