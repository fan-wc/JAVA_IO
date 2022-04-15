package com.bluemsun.javaIO.io01;

import java.io.*;

public class Test06 {
    public static void main(String[] args) {
        //数据源
        File f1 = new File("C:\\work\\bluemsun\\IO\\WriteTest01.txt");
        //目标文件
        File f2 = new File("C:\\work\\bluemsun\\IO\\CopyTest01.txt");
        // 数据源-->程序
        FileReader fr = null;
        // 程序-->目标文件
        FileWriter fw = null;
        try{
            fr = new FileReader(f1);
            // 程序-->目标文件
            fw = new FileWriter(f2);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (fw != null){
                    fw.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
            try {
                if (fr != null){
                    fr.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
