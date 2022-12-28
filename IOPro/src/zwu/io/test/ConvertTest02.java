package zwu.io.test;
/*
 * 转换流 InputStreamReader OutputStreamWriter
 * 1.以字符流的形式操作字节流（纯文本的）
 * 2.指定字符集
 * */

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ConvertTest02 {

    public static void main(String[] args) {
        try (BufferedReader reader =
                     new BufferedReader(new InputStreamReader(
                             new URL("http://www.baidu.com").openStream(), "utf-8"));
             BufferedWriter writer =
                     new BufferedWriter(new OutputStreamWriter(
                             new FileOutputStream("baidu.html"),"UTF-8"))
        ) {
            {
                String line = null;
                while ((line = reader.readLine()) != null) {
                    //System.out.println(line);
                    writer.write(line); //字符集不统一出现乱码
                    writer.newLine();
                }
                writer.flush();
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void test1(String[] args) {
        try (InputStreamReader is =
                     new InputStreamReader(new URL("http://www.baidu.com").openStream(), "utf-8")) {
            {
                int temp;
                while ((temp = is.read()) != -1) {
                    System.out.print((char) temp);
                }
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}