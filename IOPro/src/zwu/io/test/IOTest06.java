package zwu.io.test;
/*
 * 文件字符输出流
 * IO标准步骤 标准化
 * 1.创建源
 * 2.选择流
 * 3.操作（写出内容）
 * 4.释放资源
 * */

import java.io.*;

public class IOTest06 {
    public static void main(String[] args) {
        // 1.创建流
        File dest = new File("dest.txt");
        // 2.选择流
        Writer writer = null;
        try {
            writer = new FileWriter(dest, true);
            // 3.操作
            String msg = "要好好学习，天天向上！\r\n";

            //写法一
            //writer.write(msg); //直接写入String

            //写法二
            //char[] data = msg.toCharArray();//字符串-->字符数组
            //writer.write(data, 0, data.length);

            //写法三
            writer.append("hello world! \r\n").append("hi\r\n");

            writer.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //4.释放资源
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
