package zwu.io.test;
/*
 * 文件字符输入流 加入缓冲流
 * IO标准步骤 标准化
 * 1.创建源
 * 2.选择流
 * 3.操作（写出内容）
 * 4.释放资源
 * */

import java.io.*;

public class BufferedTest03 {
    public static void main(String[] args) {
        // 1.创建流
        File src = new File("abc.txt");
        // 2.选择流
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(src));
            // 3.操作
            String line = null;
            while ((line = reader.readLine()) != null) {
                //字符数组-->字符串
                System.out.println(line);
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
