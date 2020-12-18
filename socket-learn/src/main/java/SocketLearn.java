import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;

/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/16
 * @since JDK1.8
 */
public class SocketLearn {

  //获取指定主机IP
  private static void getServerIp() {
    try {
      InetAddress inetAddress = InetAddress.getByName("www.baidu.com");
      System.out.println(inetAddress);
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }
  }

  //查看端口使用
  private static void checkPort(String[] args) {
    String host = "localhost";
    if (args.length > 0) {
      host = args[0];
    }
    for (int i = 8000; i < 10000; i++) {
      try {
        System.out.println("查看 " + i);
        Socket socket = new Socket(host, i);
        System.out.println(socket.getPort() + "被使用");
      } catch (IOException e) {
//        e.printStackTrace();
      }
    }
  }

  //获取本地主机名及IP地址
  private static void getLocalHostAndName() {
    try {
      InetAddress inetAddress = InetAddress.getLocalHost();
      System.out.println(inetAddress.getHostAddress() + ":" + inetAddress.getHostName());
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }
  }

  //抓去数据
  private static void getContent() {
    try {

      URL url = new URL("http://www.baidu.com");
      BufferedReader reader = new BufferedReader
          (new InputStreamReader(url.openStream()));
      BufferedWriter writer = new BufferedWriter
          (new FileWriter("data.html"));
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
        writer.write(line);
        writer.newLine();
      }
      reader.close();
      writer.close();
    } catch (Exception e) {

    } finally {

    }

  }


  public static void main(String[] args) {
    getContent();
  }
}
