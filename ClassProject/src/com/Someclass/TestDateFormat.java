package com.Someclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 测试时间对象和字符串的互相转化
 * 使用：DateFormat、SimpleDateFormat
 * */
public class TestDateFormat {
    public static void main(String[] args) throws ParseException {
        //new出SimpleDateFormat对象
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat s2 = new SimpleDateFormat("yyyy-MM-dd");
        //将时间对象转换成字符串
        String daytime = s1.format(new Date());
        System.out.println(daytime);
        System.out.println(s2.format(new Date()));
        System.out.println(new SimpleDateFormat("hh:mm:ss").format(new Date()));

        //将符合指定格式的字符串转成时间对象。字符串格式需要和指定格式一致。
        String time1 = "2007-10-7";
        Date d1 = s2.parse(time1);
        System.out.println(d1.getTime());

        Date d2 = new Date();
        DateFormat df2 = new SimpleDateFormat("今年第w周,今年的第D天");
        System.out.println(df2.format(d2));

    }
}
