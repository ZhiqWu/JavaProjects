package com.Someclass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate02 {
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
    }
}
