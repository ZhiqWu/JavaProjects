package zwu.io.test;
/*
 * 递归 方法自己调用自己
 * 递归头：何时结束递归
 * 递归体：重复调用
 * */

import java.io.File;

public class DirTest03 {
    public static void main(String[] args) {
        File src = new File("D:\\Projects\\JavaProjects\\IOPro");
        printName(src, 0);


    }
    //打印子孙级目录和文件的名称

    public static void printName(File src, int deep) {
        for (int i = 0; i < deep; ++i) {//控制层次感
            System.out.print("-");
        }
        System.out.println(src.getName());//打印名称
        if (null == src || !src.exists()) {//递归头
            return;
        } else if (src.isDirectory()) {//递归体
            for (File s : src.listFiles()) {
                printName(s, deep + 1);
            }
        }
    }
}
