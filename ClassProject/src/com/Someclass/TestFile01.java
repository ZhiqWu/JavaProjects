package com.Someclass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
 * File类用来代表文件和目录
 * */

public class TestFile01 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("d:/movies/功夫熊猫.mp4");

        System.out.println(System.getProperty("user.dir"));
        File f3 = new File(System.getProperty("user.dir"));
        f1.createNewFile();
        System.out.println("File是否存在：" + f1.exists());
        System.out.println("File是否是目录：" + f1.isDirectory());
        System.out.println("File是否是文件：" + f1.isFile());
        System.out.println("File最后修改时间：" + new Date(f1.lastModified()));
        System.out.println("File的大小：" + f1.length());
        System.out.println("File的文件名：" + f1.getName());
        System.out.println("File的目录路径：" + f1.getAbsolutePath());

        File f2 = new File("d:/movies/china/study/coding");
        f2.mkdirs();
        f2.delete();

    }
}
