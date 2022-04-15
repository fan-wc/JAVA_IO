import java.io.File;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {

        //将文件封装成一个File类的对象
        File f1 = new File("C:\\work\\bluemsun\\IO\\TestDemo.txt");
        //注意转义问题
        File f11 = new File("C:\test.txt");    // Windows 是 \  存在问题，转义字符 \t 制表符
        File f12 = new File("C:\\test.txt");   // 因此要用 \\ 进行识别

        //如果是跨平台使用则建议使用File.separator方法获取系统的分隔符
        File f2 = new File("C:"+File.separator+"work\\bluemsun\\IO\\TestDemo.txt");
        /**
         * File.separator代表系统默认文件目录分隔符，即我们所说的“斜线”
         * 但由于在Windows系统中分隔符为“\”
         * 而在Linux系统中分隔符为“/”
         */

        /**
         * 1、separatorChar
         *       代表系统的默认名称分隔符，它被表示为一个字符串（只包含一个字符）。
         * 2、pathSeparator
         *       此字符用于分隔以路径列表形式给定的文件序列中的文件名
         *       在 UNIX和Linux系统上此字段为 ' : '
         *       在Windows 系统上为 ' ； '
         * 3、pathSeparatorChar
         *       代表系统的路径分隔符，它被表示为一个字符串（只包含一个字符）
         */

        //文件操作常用方法
        System.out.println("文件是否可读：" + f1.canRead());
        System.out.println("文件是否可写：" + f1.canWrite());
        System.out.println("获取文件的名字：" + f1.getName());
        System.out.println("获取该文件的上级目录：" + f1.getParent());
        System.out.println("是否是一个目录：" + f1.isDirectory());
        System.out.println("是否是一个文件：" + f1.isFile());
        System.out.println("是否隐藏：" + f1.isHidden());
        System.out.println("获取文件大小：" + f1.length() );
        System.out.println("是否存在：" + f1.exists());

        //文件路径
        System.out.println("绝对路径："+f1.getAbsolutePath());
        System.out.println("相对路径："+f1.getPath());
        System.out.println("toString："+f1.toString());

        File f5 = new File("demo.txt");
        if(!f5.exists()) {
            f5.createNewFile();
        }
        System.out.println("-------------------------------");
        // 绝对路径 指的就是 真实的一个精准的完整的路径
        System.out.println("绝对路径：" + f5.getAbsolutePath());
        // 相对路径 有一个参照物，相对于这个参照物的路径
        // 在main方法中，相对位置指的就是：c:\work\bluemsun\IO\TestDemo.txt
        System.out.println("相对路径：" + f5.getPath());
        // toString的效果永远是 相对路径
        System.out.println("toString：" + f5.toString());

        System.out.println("-------------------------------");
        File f6 = new File("\\a\\b\\c\\demo.txt");
        System.out.println("绝对路径：" + f6.getAbsolutePath());
        System.out.println("相对路径：" + f6.getPath());
    }
}
