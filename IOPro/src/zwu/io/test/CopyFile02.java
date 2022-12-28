package zwu.io.test;
/*
 * 使用文件字节输入流和输出流达到文件的拷贝
 * 思考：如何利用递归实现文件夹的拷贝
 * 答案：
 * 根据之前的代码，如果是文件则利用copyFile方法，
 * 如果是文件夹则创建文件夹
 *
 * */

import java.io.*;

public class CopyFile02 {
    public static void main(String[] args) throws IOException {
        long t1 = System.currentTimeMillis();
        copyFile("IO.mp4", "IOCopy.mp4");
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
    }

    public static void copyFile(String srcPath, String destPath) {
        // 1.创建源
        File src = new File(srcPath);//源头
        File dest = new File(destPath);//目的地
        // 2.选择流
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new BufferedInputStream(new FileInputStream(src));
            os = new BufferedOutputStream(new FileOutputStream(dest));
            // 3.操作（分段读取）
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                os.write(flush, 0, len);
                os.flush();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 4.释放资源，先打开的后关闭
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
