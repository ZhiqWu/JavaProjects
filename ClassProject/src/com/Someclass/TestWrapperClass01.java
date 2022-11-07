package com.Someclass;

public class TestWrapperClass01{
    public static void main(String[] args) {
        //Integer i = new Integer(300); //基本数据类型转换为Integer对象，从java9开始废弃
        Integer a = Integer.valueOf(20); //官方推荐写法

        //包装类对象转为基本数据类型
        double b = a.doubleValue();

        //将字符串数字转成包装类对象
        Integer i3 = Integer.valueOf("234");
        Integer i4 = Integer.parseInt("567");

        //将包装类对象转换为字符串
        String str = i3.toString();

        //一些常用的常量
        System.out.println(Integer.MAX_VALUE);


    }

}
