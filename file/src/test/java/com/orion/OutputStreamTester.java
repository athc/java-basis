package com.orion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.net.URL;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author jjj
 * @date 2020-03-29
 * @since JDK1.8
 */
class OutputStreamTester {


    @Test
    public void FileWriter() {
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("/Users/dujf/Desktop/demo.text");
            String content = "hellowd aaa";
            outputStream.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != outputStream) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}