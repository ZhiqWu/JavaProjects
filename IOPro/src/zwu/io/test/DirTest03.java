package zwu.io.test;
/*
 * 列出下一级
 * list() 列出下级名称
 * listFiles() 列出下级File对象
 * listRoot() 列出所有的盘符
 * */

import java.io.File;

public class DirTest02 {
    public static void main(String[] args) {
        File dir = new File("D:/Projects/JavaProjects/IOPro");

        //列出下级名称 list
        String[] subNames = dir.list();
        for (String s : subNames) {
            System.out.println(s);
        }
        //列出下级对象 listFiles
        File[] files = dir.listFiles();
        for (File f : files) {
            System.out.println(f.getAbsolutePath());
        }
        //列出所有盘符
        File[] roots = dir.listRoots();
        for (File f : roots) {
            System.out.println(f.getAbsolutePath());
        }


    }
}
