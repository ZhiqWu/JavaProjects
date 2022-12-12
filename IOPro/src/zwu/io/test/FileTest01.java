package zwu.io.test;
/*
 * 测试路径名
 * 构建对象
 * */

import java.io.File;

public class ioTest01 {
    public static void main(String[] args) {
        // \ /名称分隔符 separator
        String path = "D:\\Projects\\JavaProjects\\IOPro\\imag\\IO.png";
        System.out.println(File.separatorChar);

        //建议
        //1./
        path = "D:/Projects/JavaProjects/IOPro/imag/IO.png";
        System.out.println(path);
        //2.常量拼接
        path = "D:" + File.separator + "Projects" + File.separator + "JavaProjects"
                + File.separator + "IOPro" + File.separator + "imag" + File.separator + "IO.png";
        System.out.println(path);

        // 1.构建File对象
        File src01 = new File(path);
        System.out.println(src01.length());

        // 2.构建File对象
        File src02=new File("D:/Projects/JavaProjects/IOPro/imag","IO.png");
        System.out.println(src02.length());

        // 3.构建File对象
        File src03=new File(new File("D:/Projects/JavaProjects/IOPro/imag"),"IO.png");
        System.out.println(src03.length());
    }
}
