package zwu.io.test;
/*
 * 使用文件字节输入流和输出流达到文件的拷贝
 *
 * */

import java.io.*;

public class CopyFile01 {
    public static void main(String[] args) throws IOException {
        // 1.创建源
        File src = new File("abc.txt");//源头
        File dest = new File("dest.txt");//目的地
        // 2.选择流

        try(InputStream is = new FileInputStream(src);
            OutputStream os = new FileOutputStream(dest, true)){

            // 3.操作（分段读取）
            byte[] flush = new byte[30];
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                os.write(flush, 0, len);
                os.flush();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
