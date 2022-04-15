package com.bluemsun.javaIO.io02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test08 {
    public static void main(String[] args) throws IOException {
        //源文件
        File f = new File("c:\\work\\bluemsun\\IO\\test.jpg");
        //创建连接 文件-->程序
        FileInputStream fis = new FileInputStream(f);

        int count = 0;//记录字节数
        int n = fis.read();
        while (n != -1){
            count++;
//            System.out.println(n);
            n = fis.read();
        }
        System.out.println("字节数:" + count);
        fis.close();

        //利用缓冲数组

        FileInputStream fis1 = new FileInputStream(f);
        byte[] bytes = new byte[1024*6];
        int count1 = 0;
        int len = fis1.read(bytes);
        while(len != -1){
            for (int i = 0; i < len; i++){
//                System.out.println(bytes[i]);
                count1++;
            }
            len = fis1.read(bytes);
        }
        System.out.println("count1:" + count1);
        fis1.close();
    }
}
