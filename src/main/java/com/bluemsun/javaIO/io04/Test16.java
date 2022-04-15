package com.bluemsun.javaIO.io04;

import java.io.*;


/**
 * 数据流：用来操作基本数据类型和字符串的
 * DataInputStream:将文件中存储的基本数据类型和字符串  写入  内存的变量中
 * DataOutputStream:  将内存中的基本数据类型和字符串的变量 写出  文件中
 * 这两组流 不怎么重要 了解即可
 *
 * DataOutputStream 数据流
 */
public class Test16 {
    public static void main(String[] args) throws IOException {
        //DataOutputStream:  将内存中的基本数据类型和字符串的变量 写出 文件中
        //FileOutputStream fos = new FileOutputStream(f);
        //DataOutputStream dos = new DataOutputStream(fos);
        File f = new File("C:\\work\\bluemsun\\IO\\Test16.txt");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);

        //向外将变量写到文件中去：
        dos.writeUTF("你好");
        dos.writeBoolean(false);
        dos.writeDouble(6.9);
        dos.writeInt(82);
        //关闭流：
        dos.close();
        /**
         * DataOutputStream.writeUTF()方法输出信息，接收方收到后发现前两个字节写入了“字节数 ”，原因是：前两个字节是方法自行占有，是导致乱码。
         * 如dos.writeUTF(“2468”);
         * 在文件中写入时一共占6个字节
         * 0 4 50 52 54 56
         * 前两个字节为你写入数据的大小
         * 后面的才是具体写入数据
         */


        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);

        //将文件中内容读取到程序中来：
        System.out.println("***************************");
        System.out.println(dis.readUTF());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readDouble());
        System.out.println(dis.readInt());
        //关闭流：
        dis.close();
        /**
         要求：写出的类型跟读入的类型 必须 要匹配！
         */
    }
}
