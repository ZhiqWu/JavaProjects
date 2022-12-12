package zwu.io.test;
/*
 * 测试路径名
 * 构建对象
 * 相对路径与绝对路径
 * */

import java.io.File;

public class FileTest02 {
    public static void main(String[] args) {
        //绝对路径
        String path01 = "D:/Projects/JavaProjects/IOPro/imag/IO.png";
        File src01 = new File(path01);
        System.out.println(src01.getAbsolutePath());

        //相对路径
        System.out.println(System.getProperty("user.dir"));
        File src02 = new File("imag/iO.png");
        System.out.println(src02.getAbsolutePath());

    }
}
