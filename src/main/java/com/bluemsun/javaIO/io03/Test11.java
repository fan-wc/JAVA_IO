package com.bluemsun.javaIO.io03;

import java.io.*;

public class Test11 {
    public static void main(String[] args) throws IOException {
        //源
        File f1 = new File("c:\\work\\bluemsun\\IO\\Test11.txt");
        //目标图片
        File f2 = new File("c:\\work\\bluemsun\\IO\\CopyTest11.txt");
        // 数据源-->程序
        FileReader fr = new FileReader(f1);
        // 程序-->目标文件
        FileWriter fw = new FileWriter(f2);
        //加入--buffer
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        //读取String   缓冲字符流特有
        String str = br.readLine();
        while(str != null){
            bw.write(str);
            bw.newLine();
            str = br.readLine();
        }

        bw.close();
        br.close();
    }
}
