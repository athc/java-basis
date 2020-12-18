/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/9/28
 * @since JDK1.8
 */
public class BinaryTree {

  private Object data;

  private BinaryTree left;

  private BinaryTree right;

  public BinaryTree(Object data, BinaryTree left, BinaryTree right) {
    this.data = data;
    this.left = left;
    this.right = right;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public BinaryTree getLeft() {
    return left;
  }

  public void setLeft(BinaryTree left) {
    this.left = left;
  }

  public BinaryTree getRight() {
    return right;
  }

  public void setRight(BinaryTree right) {
    this.right = right;
  }
}
