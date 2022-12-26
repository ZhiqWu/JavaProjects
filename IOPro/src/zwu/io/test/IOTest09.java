package zwu.io.test;
/*
 * 字节数组输出流
 * IO标准步骤 标准化
 * 1.创建源 内部维护
 * 2.选择流 不关联源
 * 3.操作（写出内容）
 * 4.释放资源 可以不用
 *
 * 获取数据 toByteArray
 *
 * */

import java.io.*;

public class IOTest08 {
    public static void main(String[] args) throws IOException {

        // 1.创建源
        byte[] dest = null;
        // 2.选择流（新增方法）
        ByteArrayOutputStream os = null;
        try {
            os = new ByteArrayOutputStream();
            // 3.操作(写出)
            String msg = "show me the code";
            byte[] data = msg.getBytes();//字符串-->字符数组（编码）
            os.write(data, 0, data.length);
            os.flush();
            //获取数据
            dest = os.toByteArray();
            System.out.println(dest.length+"--->"+new String(dest,0,os.size()));
        } finally {
            try {
                // 4.释放资源
                if (os != null) {
                    os.close();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
