package com.bluemsun.javaIO.io01;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) throws IOException {
        //创建File对象
        File f1 = new File("C:\\work\\bluemsun\\IO\\Test03.txt");
        //利用FileReader创建文件到程序的连接    文件-->程序
        FileReader fileReader = new FileReader(f1);
        //读取文件中的数据
        int n = fileReader.read();
        //取指定字节的数据。返回为整数值。返回下一字节数据，如果已经到结尾则返回-1

        //补充：流，数据库，网络资源，靠JVM本身没有办法帮我们关闭，此时必须程序员手动关闭
        fileReader.close();

        File f2 = new File("C:\\work\\bluemsun\\IO\\Test04.txt");
        FileReader fileReader1 = new FileReader(f2);
        /**
         * 读到-1即文件尾停止
         */
        int c = fileReader1.read();
        while (c != -1){
            System.out.println((char) c );
            c = fileReader1.read();
        }
        fileReader1.close();


        /**
         * 利用缓冲数组
         */

        System.out.println("缓冲数组");
        FileReader fileReader2 = new FileReader(f1);
        char[] ch = new char[8];
        int len = fileReader2.read(ch);
        while (len != -1){
//            System.out.println(len);
//
//            for (int i = 0; i < len; i++){
//                System.out.println(ch[i]);
//            }

            String str = new String(ch,0,len);
            System.out.print(str);
            len = fileReader2.read(ch);
        }
        fileReader2.close();
    }
}
