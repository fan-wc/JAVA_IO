package com.bluemsun.javaIO.io05;

import com.bluemsun.javaIO.Person;

import java.io.*;

/**
 * 序列化与反序列化自定义对象
 */

public class Test18 {

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        //目标文件
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
        //对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.dat"));
        //程序-->目标文件
        oos .writeObject(new Person("Lihua",20));
        //-->对象
        Object ob = ois.readObject();
        Person person = (Person) ob;
        System.out.println(person.toString());
        //关闭连接
        oos.close();
        ois.close();
    }
}
