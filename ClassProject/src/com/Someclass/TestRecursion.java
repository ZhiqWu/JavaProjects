package com.Someclass;

import java.io.File;
/*
 * 递归测试
 * */

public class TestRecursion {

    public static int num = 3;

    public static void a() {
        num--;
        System.out.println("TestRecursion.a");
        if (num > 0) {
            a();
        }
    }

    public static void b() {
        System.out.println("TestRecursion.b");
    }

    static void printFile(File file, int level) {
        //输出层次
        for (int i = 0; i < level; ++i) {
            System.out.print("-");
        }

        //输出文件名
        System.out.println(file.getName());

        //如果file是目录，则获取子文件列表，并对每个子文件进行相同的操作
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File temp : files) {
                //递归调用该方法
                printFile(temp, level + 1);
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("C:/Project/java");
        printFile(file, 0);
    }

}
