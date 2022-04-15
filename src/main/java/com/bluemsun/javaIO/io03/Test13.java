package com.bluemsun.javaIO.io03;

import java.io.*;

public class Test13 {
    public static void main(String[] args) throws IOException {
        //1.有一个源文件
        File f1 = new File("c:\\work\\bluemsun\\IO\\Test13.txt");

        //2.有一个目标文件：
        File f2 = new File("c:\\work\\bluemsun\\IO\\CopyTest13.txt");

        //3.输入方向：
        FileInputStream fis = new FileInputStream(f1);
        InputStreamReader isr = new InputStreamReader(fis,"utf-8");
        //4.输出方向：
        FileOutputStream fos = new FileOutputStream(f2);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");
        //5.开始动作：
        char[] ch = new char[20];
        int len = isr.read(ch);
        while(len!=-1){
            osw.write(ch,0,len);
            len = isr.read(ch);
        }
        //6.关闭流：（只关闭高级流就可以了）
        osw.close();
        isr.close();
    }
}
