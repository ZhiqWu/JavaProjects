package zwu.io.test;
/*
 * 转换流 InputStreamReader OutputStreamWriter
 * 1.以字符流的形式操作字节流（纯文本的）
 * 2.指定字符集
 * */

import java.io.*;

public class ConvertTest {
    public static void main(String[] args) {
        //System.in System.out
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            //循环获取键盘的输入（exit），输出此内容
            String msg = "";
            while (!msg.equals("exit")) {
                msg = reader.readLine();
                writer.write(msg);
                writer.newLine();
                writer.flush();         //强制刷新
            }
        } catch (IOException e) {
            System.out.println("操作异常！");
            ;
        }
    }
}
