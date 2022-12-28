package zwu.io.test;
/*
 * 文件字符输出流 加入缓冲流
 * IO标准步骤 标准化
 * 1.创建源
 * 2.选择流
 * 3.操作（写出内容）
 * 4.释放资源
 * */

import java.io.*;

public class BufferedTest04 {
    public static void main(String[] args) {
        // 1.创建流
        File dest = new File("dest.txt");
        // 2.选择流
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(dest));
            // 3.操作
            String msg = "要好好学习，天天向上！\r\n";

            //写法一
            //writer.write(msg); //直接写入String

            //写法二
            //char[] data = msg.toCharArray();//字符串-->字符数组
            //writer.write(data, 0, data.length);

            //写法三
            writer.append("hello world!");
            writer.newLine();
            writer.append("hi");
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
