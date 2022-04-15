package com.bluemsun.javaIO.io01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) throws IOException {
        //目标文件
        File f1 = new File("C:\\work\\bluemsun\\IO\\WriteTest01.txt");
        //连接程序到目标文件  程序-->目标文件
        FileWriter fileWriter = new FileWriter(f1,true);//记得抛出异常

        //向目标文件写入数据
        String str = "Hello Bluemsun！欢迎来到蓝旭工作室，今天讲述的内容是JavaIO";
        //一个字符一个字符地输出
        for(int i = 0; i < str.length(); i++){
            fileWriter.write(str.charAt(i));
        }
        fileWriter.close();
        /**
         * 知识点：
         * 如果目标文件不存在的话，那么会自动创建此文件
         * 如果目标文件存在的话：
         *      new FileWriter(f)   相当于对原文件进行覆盖操作。    与 false 结果一样
         *      new FileWriter(f,false)  相当于对源文件进行覆盖操作。不是追加。
         *      new FileWriter(f,true)   对原来的文件进行追加，而不是覆盖。
         */
        FileWriter fw = new FileWriter(f1,true);

        //利用缓冲数组进行输出
        char[] strs = str.toCharArray();

        fw.write(strs);
        fw.close();
    }
}
