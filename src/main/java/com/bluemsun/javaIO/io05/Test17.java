package com.bluemsun.javaIO.io05;

import java.io.*;

/**
 * 对象流
 */
public class Test17 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("C:\\work\\bluemsun\\IO\\Test17.txt")));
        //将内存中的字符串对象写出到文件中：
        oos.writeObject("你好");
        //关闭流：
        oos.close();
        //将文件中保存的字符串 读入到 内存：
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("C:\\work\\bluemsun\\IO\\Test17.txt")));
        //读取：
        String s = (String)(ois.readObject());
        System.out.println(s);
        //关闭流：
        ois.close();
    }
}
