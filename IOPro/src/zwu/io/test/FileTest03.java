package zwu.io.test;
/*
 * 名称或路径
 * */

import java.io.File;

public class FileTest03 {
    public static void main(String[] args) {
        File src01 = new File("D:/Projects/JavaProjects/IOPro/imag/IO.png");
        //基本信息
        System.out.println("名称：" + src01.getName());
        System.out.println("路径：" + src01.getPath());
        System.out.println("绝对路径：" + src01.getAbsolutePath());
        System.out.println("父路径：" + src01.getParent());
    }
}
