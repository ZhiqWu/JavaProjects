package zwu.io.test;
/*
 * 创建目录
 * mkdir() 必须确保上级目录存在，不存在创建失败
 * mkdirs() 上级目录可以不存在，不存在则一同创建
 * */

import java.io.File;

public class DirTest01 {
    public static void main(String[] args) {
        File dir = new File("D:/Projects/JavaProjects/IOPro/dir/test");
        //创建目录 mkdirs()
        System.out.println(dir.mkdirs());

        //创建目录 mkdir()
        dir = new File("D:/Projects/JavaProjects/IOPro/dir/test2");
        System.out.println(dir.mkdir());

    }
}
