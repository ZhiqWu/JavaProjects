package zwu.io.test;
/*
 * 1.图片读取到字节数组中
 * 2.将字节数组写出到文件
 *
 *  * */

import java.io.*;

public class IOTest09 {
    public static void main(String[] args) throws IOException {
        byte[] data = fileToByteArray("p.png");
        System.out.println(data.length);
        byteArrayToFile(data, "p1.png");
    }

    /*
     * 1.图片读取到字节数组中
     * 1) 图片到程序 FileInputStream
     * 2）程序到字节数组 ByteArrayOutputStream
     * */
    public static byte[] fileToByteArray(String filePath) throws IOException {
        // * 1.创建源与目的地
        File src = new File(filePath);
        byte[] dest = null;
        // * 2.选择流
        InputStream is = null;
        ByteArrayOutputStream os = null;
        try {
            is = new FileInputStream(src);
            os = new ByteArrayOutputStream();
            // * 3.操作(分段读取)
            byte[] flush = new byte[1024 * 10];//缓冲容器,一次读取多少个字节
            int len = -1;//接收长度
            while ((len = is.read(flush)) != -1) {
                //字节数组 -->字符串数组
                os.write(flush, 0, len);//写出到字节数组中
            }
            os.flush();
            return os.toByteArray();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // * 4.释放资源
            if (is != null) {
                is.close();
            }
        }
    }

    /*
     * 2.字节数组写出到图片中
     * 1) 字节数组读取到程序中 ByteArrayInputStream
     * 2）程序写出到文件 FileOutputStream
     * */
    public static void byteArrayToFile(byte[] src, String filePath) throws IOException {
        // * 1.创建源
        File dest = new File(filePath);
        // * 2.选择流
        ByteArrayInputStream is = null;
        OutputStream os = null;
        try {

            is = new ByteArrayInputStream(src);
            os = new FileOutputStream(dest);

            // * 3.操作(分段读取)
            byte[] flush = new byte[1024];//缓冲容器,一次读取多少个字节
            int len = -1;//接收长度
            while ((len = is.read(flush)) != -1) {
                os.write(flush, 0, len); //写出到文件
            }
            os.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // * 4.释放资源
            if (os != null) {
                os.close();
            }
        }
    }
}
