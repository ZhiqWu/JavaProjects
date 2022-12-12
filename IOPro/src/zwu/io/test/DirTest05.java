package zwu.io.test;
/*
 *统计文件夹大小
 *  */

import java.io.File;

public class DirTest04 {
    public static void main(String[] args) {
        File src = new File("D:\\Projects\\JavaProjects\\IOPro");
        countFiles(src);
        System.out.println(len);

    }

    private static long len = 0;

    //统计文件夹大小
    public static void countFiles(File src) {
        //获取大小
        if (src == null || !src.exists()) {
            return;
        } else {
            if (src.isFile()) {
                len = src.length();
            } else {
                for (File f : src.listFiles()) {
                    countFiles(f);
                }
            }
        }
    }
}
