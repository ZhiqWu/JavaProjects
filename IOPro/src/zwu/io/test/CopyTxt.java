package zwu.io.test;
/*
 * 使用文件字节输入流和输出流达到纯文本的拷贝 加入缓冲流
 * 思考：如何利用递归实现文件夹的拷贝
 * 答案：
 * 根据之前的代码，如果是文件则利用copyFile方法，
 * 如果是文件夹则创建文件夹
 *
 * */

import java.io.*;

public class CopyTxt {
    public static void main(String[] args) throws IOException {
        copyTxt("abc.txt", "abe.txt");
    }

    public static void copyTxt(String srcPath, String destPath) {
        // 1.创建源
        File src = new File(srcPath);//源头
        File dest = new File(destPath);//目的地
        // 2.选择流

        try (BufferedReader br = new BufferedReader(new FileReader(src));
             BufferedWriter bw = new BufferedWriter(new FileWriter(dest))) {

            // 3.操作（分行读取）
            String line = null;

            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
