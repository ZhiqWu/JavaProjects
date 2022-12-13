package zwu.io.test;

/*
 * 编码：字节-->字符
 * */

import java.io.UnsupportedEncodingException;

public class ContentDecode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg = "性命生命使命aaa";
        //编码：字节数组
        byte[] data = msg.getBytes();


        //解码：字符串
        String msg1 = new String(data, 0, data.length, "UTF-8");
        System.out.println(msg1);

        //乱码：
        // 1.字节数不够
        String msg2 = new String(data, 0, data.length-4, "UTF-8");
        System.out.println(msg2);

        //乱码：
        // 2.字符集不统一
        String msg3 = new String(data, 0, data.length-4, "GBK");
        System.out.println(msg3);

    }
}
