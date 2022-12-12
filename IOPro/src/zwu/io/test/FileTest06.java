package zwu.io.test;

import java.io.File;
import java.io.IOException;

/*
 * 创建文件 createNewFile()不存在才创建
 * 删除文件 delete()删除已经存在的文件
 * */

public class FileTest06 {
    public static void main(String[] args) throws IOException {
        File src01 = new File("D:/Projects/JavaProjects/IOPro/IO.txt");
        boolean flag = src01.createNewFile();
        System.out.println(flag);

        //不是文件夹
        File src02 = new File("D:/Projects/JavaProjects/IOPro/test");
        boolean flag02 = src02.createNewFile();
        System.out.println(flag02);

        src02.delete();//删除

        //补充：con com3...操作系统的设备名，不能正确创建


    }
}
