package com.bluemsun.javaIO.io02;

import java.io.*;

public class Test09 {
    public static void main(String[] args) throws IOException {
        //源
        File f1 = new File("c:\\work\\bluemsun\\IO\\test.jpg");
        //目标图片
        File f2 = new File("c:\\work\\bluemsun\\IO\\Copytest.jpg");
        // 数据源-->程序
        FileInputStream fis = new FileInputStream(f1);
        // 程序-->目标文件
        FileOutputStream fos = new FileOutputStream(f2);

        long s = System.currentTimeMillis();

        int n = fis.read();
        while (n != -1){
            fos.write(n);
            n = fis.read();
        }
        long e = System.currentTimeMillis();
        System.out.println("一个一个 复制完成时间为:" + (e - s) + "ms");

        fos.close();
        fis.close();

        f2.delete();

        //利用缓冲数组

        // 数据源-->程序
        FileInputStream fis1 = new FileInputStream(f1);
        // 程序-->目标文件
        FileOutputStream fos1 = new FileOutputStream(f2);

        long st = System.currentTimeMillis();

        byte[] bytes = new byte[1024 * 6];
        int len = fis1.read(bytes);

        while(len != -1){
            fos1.write(bytes, 0, len);
            len = fis1.read(bytes);
        }

        long et = System.currentTimeMillis();
        System.out.println("缓冲数组 复制完成时间为:" + (et - st) + "ms");
        fos1.close();
        fis1.close();
    }
}
