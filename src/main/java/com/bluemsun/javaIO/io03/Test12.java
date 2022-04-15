package com.bluemsun.javaIO.io03;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test12 {
    public static void main(String[] args) throws IOException {
        //源
        File f1 = new File("c:\\work\\bluemsun\\IO\\Test12.txt");
        //2.需要一个输入的字节流接触文件：
        FileInputStream fis = new FileInputStream(f1);
        /**
         * 3.加入一个转换流，将字节流转换为字符流：（转换流也属于处理流）
         * 将字节转换为字符的时候，需要指定一个编码，这个编码跟文件本身的编码格式统一
         * 如果编码格式不统一的话，那么在控制台上展示的效果就会出现乱码
         */
//        InputStreamReader isr = new InputStreamReader(fis,"utf-8");
//        InputStreamReader isr = new InputStreamReader(fis,"gbk");
        // 如果什么都不写的话，该构造器会自动获取程序本身的编码
        InputStreamReader isr = new InputStreamReader(fis);
        char[] ch = new char[20];
        int len = isr.read(ch);
        while (len != -1){
            //将缓冲数组转为字符串在控制台上打印出来
            System.out.print(new String(ch,0,len));
            len = isr.read(ch);
        }

        //关闭流
        isr.close();
    }
}
