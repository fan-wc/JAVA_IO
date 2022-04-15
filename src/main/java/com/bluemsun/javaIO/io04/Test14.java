package com.bluemsun.javaIO.io04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) throws FileNotFoundException {
        //得到的是标准的输入流：--》从键盘输入：
        //InputStream in = System.in;
        //调用方法：
        //int n = in.read();//read方法等待键盘的录入，所以这个方法是一个阻塞方法。
        //System.out.println(n);
        /**
         * 课本上的代码：从键盘录入一个int类型的数据：
         * 从上面的代码证明，键盘录入实际上是：System.in
         * 形象的理解：System.in管，这个管怼到键盘上去了，所以你从键盘录入的话，就从这个管到程序中了
         * Scanner的作用：扫描器：起扫描作用的，扫 键盘的录入的从这根管出来的数据
         */
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        System.out.println(i);
//        既然Scanner是扫描的作用，不一定非得扫 System.in进来的东西，还可以扫描其他管的内容：

//        Scanner是一个基于正则表达式的文本扫描器，它可以从文件、输入流、字符串中解析出基本类型值和字符串值。
//        Scanner类提供了多个构造器，不同的构造器可接受文件、输入流、字符串作为数据源，用于从文件、输入流、字符串中解析数据。
//        Scanner sc = new Scanner(new FileInputStream(new File("/Users/wubohui/Desktop/Bluemsun2021/test14.txt")));
//        Scanner sc = new Scanner(new FileReader(new File("/Users/wubohui/Desktop/Bluemsun2021/test14.txt")));
        Scanner sc = new Scanner(new File("c:\\work\\bluemsun\\IO\\Test14.txt"));
        while(sc.hasNext()){
            System.out.println(sc.next());
        }
        System.out.println("Hello World!");
        System.out.print("      Hello");
        System.out.print("      Hello");
    }
}
