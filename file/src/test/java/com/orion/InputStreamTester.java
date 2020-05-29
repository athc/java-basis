package com.orion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author jjj
 * @date 2020-03-29
 * @since JDK1.8
 */
class InputStreamTester {

    @Test
    public void main(String[] args) throws IOException {
        InputStream inputStream = null;
        byte[] content = new byte[1024 * 1024 * 1024];
        int size = 0;
        try {
            int len;
            inputStream = new FileInputStream("/Users/dujf/Desktop/ocang.sql");
            while ((len = inputStream.read()) != -1) {
                content[size] = (byte) len;
                size++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
        }

        String res = new String(content, 0, size);
        Assertions.assertNotNull(res);
        Assertions.assertTrue(res.length() > 0);
    }

    /**
     * 读取网络图片
     */
    @Test
    public void readUrl() {
        String path = "/Users/dujf/Desktop/";
        try {
            URL url = new URL("https://webit-prod.s3-ap-northeast-1.amazonaws.com/publics/20200313/a0b59bef-f9e4-4ed7-aad1-431b4e627fa2.png");
            InputStream inputStream = url.openConnection().getInputStream();
            url.openConnection();
            path = path + System.currentTimeMillis() + ".png";
            File file = new File(path);
            OutputStream outputStream = new FileOutputStream(file);
            int len;
            while ((len = inputStream.read()) != -1) {
                outputStream.write(len);
            }
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void FileWriter() {
        File file = new File("/Users/dujf/Desktop/demo.txt");
        Writer writer = null;
        try {
            writer = new FileWriter(file, true);
            writer.write("hello world");
            writer.write("\n");
            writer.write("张三");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}