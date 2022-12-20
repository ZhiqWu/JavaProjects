package zwu.io.test;
/*
 * 文件字符输入流
 * IO标准步骤 标准化
 * 1.创建源
 * 2.选择流
 * 3.操作（写出内容）
 * 4.释放资源
 * */

import java.io.*;

public class IOTest05 {
    public static void main(String[] args) {
        // 1.创建流
        File src = new File("abc.txt");
        // 2.选择流
        Reader reader = null;
        try {
            reader = new FileReader(src);
            // 3.操作
            char[] flush = new char[1024];//缓冲容器
            int len = -1;//接收长度
            while ((len = reader.read(flush)) != -1) {
                //字符数组-->字符串
                String str = new String(flush, 0, len);
                System.out.println(str);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //4.释放资源
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
