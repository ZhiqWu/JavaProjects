package zwu.io.test;
/*
 *使用面向对象：统计文件夹大小
 *  */

import java.io.File;

public class DirTest05 {
    //目录大小
    private static long len;
    //文件个数
    private static int fileSize;
    //文件夹个数
    private static int dirSize = -1;
    //文件夹
    private String dirPath;
    //源
    private File src;

    public DirTest05(String dirPath) {
        this.dirPath = dirPath;
        this.src = new File(dirPath);
        count(src);
    }


    public static void main(String[] args) {
        DirTest05 dir = new DirTest05("D:\\Projects\\JavaProjects\\IOPro");
        System.out.println(dir.getLen());
        System.out.println(dir.getFileSize());
        System.out.println(dir.getDirSize());
    }

    private void count(File src) {
        //获取大小
        if (src == null || !src.exists()) {
            return;
        } else {
            if (src.isFile()) {
                len += src.length();
                fileSize++;
            } else {
                dirSize++;
                for (File f : src.listFiles()) {
                    count(f);
                }
            }
        }
    }

    public static long getLen() {
        return len;
    }

    public static void setLen(long len) {
        DirTest05.len = len;
    }

    public static int getFileSize() {
        return fileSize;
    }

    public static void setFileSize(int fileSize) {
        DirTest05.fileSize = fileSize;
    }

    public static int getDirSize() {
        return dirSize;
    }

    public static void setDirSize(int dirSize) {
        DirTest05.dirSize = dirSize;
    }
}
