package com.bluemsun.javaIO.io01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test05 {
    public static void main(String[] args) throws IOException {
        //数据源
        File f1 = new File("C:\\work\\bluemsun\\IO\\WriteTest01.txt");
        //目标文件
        File f2 = new File("C:\\work\\bluemsun\\IO\\CopyTest01.txt");
        // 数据源-->程序
        FileReader fr = new FileReader(f1);
        // 程序-->目标文件
        FileWriter fw = new FileWriter(f2);

        //一个字节一个字节复制
        int n = fr.read();
        while (n != -1){
            fw.write(n);
            n = fr.read();
        }

        //利用缓冲数组
        char[] ch = new char[5];
        int len = fr.read(ch);
        while (len != -1){
            //转化成字符串
//            String str = new String(ch, 0, len);
//            fw.write(str);
            fw.write(ch,0,len);
            len = fr.read(ch);
        }
        fw.close();
        fr.close();
    }
}
