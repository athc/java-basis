package com.orion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * @author jjj
 * @date 2020-03-06
 * @since JDK1.8
 */
public class FileDemo {

    public Boolean createFile() {
        File file = new File(desktop + "/abc.txt");
        try {
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getLocalizedMessage());
            return false;
        }
    }

    public Boolean delete() {
        File file = new File(desktop + "/abc.txt");
        return file.delete();
    }

    public Boolean createDir() {
        File file = new File(desktop + "/abc");
        //创建文件夹
        return file.mkdir();
    }

    public Boolean deleteDir() {
        File file = new File(desktop + "/abc");
        //删除文件夹
        return file.delete();
    }

    public void fileList() {
        File file = new File(desktop);
        String[] strings = file.list();
        File[] files = file.listFiles();
        Arrays.stream(files).forEach(it -> System.out.println(it.getName()));
    }

    public void writeWords() {
        File file = f;
        try {
            RandomAccessFile accessFile = new RandomAccessFile(file, "rw");
            accessFile.writeChars("abc");
            accessFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private File f = new File("/Users/dujf/Desktop/abc.txt");
    private String desktop = "/Users/dujf/Desktop";

}
