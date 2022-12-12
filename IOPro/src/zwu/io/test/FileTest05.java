package zwu.io.test;
/*
 * 文件状态
 * */

import java.io.File;

public class FileTest04 {
    public static void main(String[] args) {
        File src01 = new File("D:/Projects/JavaProjects/IOPro/imag/IO.png");

        System.out.println("是否存在：" + src01.exists());
        System.out.println("是否文件：" + src01.isFile());
        System.out.println("是否文件夹：" + src01.isDirectory());

        System.out.println("-----------------------------");

        File src02 = new File("mag/II.png");

        System.out.println("是否存在：" + src02.exists());
        System.out.println("是否文件：" + src02.isFile());
        System.out.println("是否文件夹：" + src02.isDirectory());

        //文件状态
        File src = new File("xxx");
        if (null == src || !src.exists()) {
            System.out.println("文件不存在");
        } else {
            if (src.isFile()) {
                System.out.println("文件操作");
            } else {
                System.out.println("文件夹操作");
            }
        }


    }
}
