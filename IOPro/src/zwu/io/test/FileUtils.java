package zwu.io.test;
/*
 * 1.封装拷贝
 * 2.封装释放资源
 * */

import java.io.*;

public class FileUtils {
    public static void main(String[] args) throws FileNotFoundException {
        //文件到文件
        InputStream is1 = new FileInputStream("abc.txt");
        OutputStream os1 = new FileOutputStream("abcCopy.txt");
        copy(is1, os1);

        //从文件到字节数组
        InputStream is2 = new FileInputStream("p.png");
        ByteArrayOutputStream os2 = new ByteArrayOutputStream();
        copy(is2, os2);
        byte[] data = os2.toByteArray();
        System.out.println(data.length);

        //从字节数组到文件
        ByteArrayInputStream is3 = new ByteArrayInputStream(data);
        OutputStream os3 = new FileOutputStream("data.png");
        copy(is3, os3);

    }


    /*
     * 对接输入输出流
     *
     * */
    public static void copy(InputStream is, OutputStream os) {
        try {
            // 3.操作（分段读取）
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                os.write(flush, 0, len);
                os.flush();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            close(is, os);
        }
    }

    /*
     * 释放资源
     * */

    public static void close(InputStream is, OutputStream os) {
        // 4.释放资源，先打开的后关闭
        try {
            if (os != null) {
                os.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            if (is != null) {
                is.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*
    * 释放资源
    * */

    public static void close(Closeable... ios){
        for(Closeable io:ios){
            try {
                if (io != null) {
                    io.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
