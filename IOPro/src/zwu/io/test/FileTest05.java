package zwu.io.test;
/*
 *
 * length() long 字节数
 * */

import java.io.File;

public class FileTest05 {
    public static void main(String[] args) {
        File src01 = new File("D:/Projects/JavaProjects/IOPro/imag/IO.png");
        System.out.println(src01.length());

        File src02 = new File("D:/Projects/JavaProjects/IOPro/imag");
        System.out.println(src02.length());


    }
}
