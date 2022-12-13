package zwu.io.test;

/*
 * 编码：字符串-->字节
 * */

import java.io.UnsupportedEncodingException;

public class ContentEncode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg = "性命生命使命";
        //编码：字节数组
        byte[] data = msg.getBytes();
        System.out.println(data.length);//utf-8 每个中文汉字占3个字节，共18个字节

        //编码：其他字符集
        data = msg.getBytes("UTF-16LE");
        System.out.println(data.length);

        data = msg.getBytes("GBK");
        System.out.println(data.length);
    }
}
