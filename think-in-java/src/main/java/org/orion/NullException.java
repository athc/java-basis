package org.orion;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/23
 * @since JDK1.8
 */
public class NullException extends RuntimeException {

  private static final long serialVersionUID = -2572826452100922871L;

  private String message = "";

  private String code = "";

  public NullException(String message, String code) {
    this.code = code;
    this.message = message;
  }

  @Override public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }
}
