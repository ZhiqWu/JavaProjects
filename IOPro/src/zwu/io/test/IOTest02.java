package zwu.io.test;
/*
 * IO标准步骤
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放资源
 * */

import java.io.*;

public class IOTest01 {
    public static void main(String[] args) {
        //* 1.创建源
        File src = new File("abc.txt");
        //* 2.选择流
        try {
            InputStream is = new FileInputStream(src);
            //* 3.操作
            int data1 = is.read();//第一个数据z
            int data2 = is.read();//第二个数据w
            int data3 = is.read();//第三个数据u
            int data4 = is.read();//第四个数据????，文件末尾，返回-1
            System.out.println((char) data1);
            System.out.println((char) data2);
            System.out.println((char) data3);
            System.out.println((char) data4);
            System.out.println(data4);

            //* 4.释放资源
            is.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
