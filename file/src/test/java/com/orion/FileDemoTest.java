package com.orion;


import java.io.File;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author jjj
 * @date 2020-03-06
 * @since JDK1.8
 */
public class FileDemoTest {

    @Test
    public void createFile() {
        FileDemo fileDemo = new FileDemo();
        Boolean res = fileDemo.createFile();
        Assertions.assertTrue(res);
    }

    @Test
    public void delete() {
        FileDemo fileDemo = new FileDemo();
        Boolean res = fileDemo.delete();
        Assertions.assertTrue(res);
    }



    @Test
    public void createDir() {
        FileDemo fileDemo = new FileDemo();
        Boolean res = fileDemo.createDir();
        Assertions.assertTrue(res);
    }

    @Test
    public void deleteDir() {
        FileDemo fileDemo = new FileDemo();
        Boolean res = fileDemo.deleteDir();
        Assertions.assertTrue(res);
    }

    @Test
    public void fileList() {

    }

    @Test
    public void f() {
        FileDemo fileDemo = new FileDemo();
        fileDemo.writeWords();
    }


}
