package zwu.io.test;
/*
 * 文件字节输出流
 * IO标准步骤 标准化
 * 1.创建源
 * 2.选择流
 * 3.操作（写出内容）
 * 4.释放资源
 * */

import java.io.*;

public class IOTest04 {
    public static void main(String[] args) throws IOException {

        // 1.创建源
        File dest = new File("dest.txt");
        // 2.选择流
        OutputStream os = null;
        try {
            os = new FileOutputStream(dest, true);
            // 3.操作
            String msg = "IO is so easy,on my way\r\n";
            byte[] data = msg.getBytes();//字符串-->字符数组（编码）
            os.write(data, 0, data.length);
            os.flush();

        } finally {
            try {
                if (os != null) {
                    os.close();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }


    }
}
