package com.bluemsun.javaIO.io03;

import java.io.*;

public class Test10 {
    public static void main(String[] args) throws IOException {
        //源
        File f1 = new File("c:\\work\\bluemsun\\IO\\test.jpg");
        //目标图片
        File f2 = new File("c:\\work\\bluemsun\\IO\\test10.jpg");
        // 数据源-->程序
        FileInputStream fis = new FileInputStream(f1);
        // 程序-->目标文件
        FileOutputStream fos = new FileOutputStream(f2);
        //加入--buffer
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        long st = System.currentTimeMillis();
        byte[] bytes = new byte[1024 * 8];
        int len = bis.read(bytes);
        while(len != -1){
            bos.write(bytes);
            len = bis.read(bytes);// 当缓冲区已经满了的时候，需要进行bos.flush(); 底层已经帮我们做了刷新缓冲区的操作，不用我们手动完成：底层调用flushBuffer()
        }
        long et = System.currentTimeMillis();
        System.out.println("缓冲流 复制完成时间" + (et - st) +"ms");

        //如果处理流包裹着节点流的话，那么其实只要关闭高级流（处理流），那么里面的节点流也会随之被关闭。
        bos.close();
        bis.close();
    }
}
