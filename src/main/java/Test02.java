import java.io.File;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        //将目录封装为一个File类的对象
        File f1 = new File("C:\\work\\bluemsun\\IO\\demo");

        //常用方法
        System.out.println("文件是否可读：" + f1.canRead());
        System.out.println("文件是否可写：" + f1.canWrite());
        System.out.println("获取文件的名字：" + f1.getName());
        System.out.println("获取该文件的上级目录：" + f1.getParent());
        System.out.println("是否是一个目录：" + f1.isDirectory());
        System.out.println("是否是一个文件：" + f1.isFile());
        System.out.println("是否隐藏：" + f1.isHidden());
        System.out.println("获取文件大小：" + f1.length() );
        System.out.println("是否存在：" + f1.exists());

        System.out.println("绝对路径："+f1.getAbsolutePath());
        System.out.println("相对路径："+f1.getPath());
        System.out.println("toString："+f1.toString());

        //目录相关方法
        //创建多层目录
        /**
         * 删除目录时只删除一次，并且要求本层目录为空，如果有内容子不会被删除
         */
        File f2 = new File("C:\\work\\bluemsun\\IO\\demo\\a\\b\\c");

        f2.delete();

        String[] fileList = f1.list();
        /**
         * 获取目录下文件名或文件夹名
         */
        for (String s: fileList){
            System.out.println(s);
        }
        System.out.println("--------------------------------------");
        File[] files = f1.listFiles();
        /**
         * 将文件或者文件夹也封装到File对象里
         */
        for (File file: files){
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
        }
    }
}
