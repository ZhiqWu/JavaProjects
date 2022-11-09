package com.uu;

import java.io.File;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        System.out.println("step1");
        try {//try把可能异常的语句包起来
            int i = 1 / 0;          //运行时异常
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("step2");
        Exception e;
        File f = new File("D:/a.txt");
        //f.createNewFile(); //checkerException:编译时检查的异常

    }
}
