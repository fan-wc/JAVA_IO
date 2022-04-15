package com.bluemsun.javaIO.io02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test07 {
    public static void main(String[] args) throws IOException {
        //源文件
        File f1 = new File("c:\\work\\bluemsun\\IO\\Test07.txt");
        //创建连接 文件-->程序
        FileInputStream fis = new FileInputStream(f1);
        /**
         细节1：
         文件是utf-8进行存储的
         所以英文字符 底层实际占用1个字节
         但是中文字符，底层实际占用3个字节。
         细节2：
         如果文件是文本文件，那么就不要使用字节流读取了，字节流已经给它拆开了，建议使用字符流。
         细节3：
         read()读取一个字节，但是你有没有发现返回值是 int类型，而不是byte类型？  byte 范围 -127，128  此时 -1 是当作字节处理呢，还是当作文件结尾处理呢？
         read方法底层做了处理，让返回的数据都是“正数”
         就是为了避免如果字节返回的是-1的话，那到底是读入的字节，还是到文件结尾呢。
         */

        int n = fis.read();
        while(n != -1){
            System.out.println(n);
            n = fis.read();
        }
        fis.close();
    }
}
