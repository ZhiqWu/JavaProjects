package zwu.io.test;
/*
 * IO标准步骤 标准化
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放资源
 * */

import java.io.*;

public class IOTest02 {
    public static void main(String[] args) throws IOException {

        // * 1.创建源
        File src = new File("abc.txt");
        InputStream is = null;
        try {
            // * 2.选择流
            is = new FileInputStream(src);
            // * 3.操作
            int temp;
            while ((temp = is.read()) != -1) {
                System.out.println((char) temp);
            }
        } finally {
            // * 4.释放资源
            if (is != null) {
                is.close();
            }
        }
    }
}
