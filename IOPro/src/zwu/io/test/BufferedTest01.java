package zwu.io.test;
/*
 * IO标准步骤 标准化 文件字节输入流 加入缓冲流
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放资源
 * */

import java.io.*;

public class BufferedTest01 {
    public static void main(String[] args) throws IOException {

        // * 1.创建源
        File src = new File("abc.txt");
        InputStream is = null;

        try {
            // * 2.选择流
            is = new BufferedInputStream(new FileInputStream(src));
            // * 3.操作(分段读取)
            byte[] flush = new byte[1024];//缓冲容器,一次读取多少个字节
            int len = -1;//接收长度
            while ((len = is.read(flush)) != -1) {
                //字节数组 -->字符串数组
                String str = new String(flush, 0, len);
                System.out.println(str);
            }
        } finally {
            // * 4.释放资源
            if (is != null) {
                is.close();
            }
        }
    }
}
