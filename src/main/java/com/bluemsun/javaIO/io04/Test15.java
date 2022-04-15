package com.bluemsun.javaIO.io04;

import java.io.*;

/**
 * 键盘输入到文件中
 */
public class Test15 {
    public static void main(String[] args) throws IOException {
        //1.先准备输入方向：
        //键盘录入：
        InputStream in = System.in;     //属于字节流
        //字节流--》字符流：
        InputStreamReader isr = new InputStreamReader(in);
        //在isr外面再套一个缓冲流：
        BufferedReader br = new BufferedReader(isr);

        //2.再准备输出方向：
        //准备目标文件
        File f = new File("C:\\work\\bluemsun\\IO\\Test15.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);

        //3.开始读入
        String s = br.readLine();
        while (! s.equals("exit")){
            bw.write(s);
            bw.newLine();
            s = br.readLine();
        }

        //4.关闭源
        bw.close();
        br.close();
    }
}
