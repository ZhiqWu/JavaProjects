package com.Someclass;

public class TestWrapperClass01 {
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

        //自动装箱
        Integer i5 = 300;     //编译器帮你改成：Integer a = Integer.valueOf(300);

        //自动拆箱
        int i6 = a;           //编译器帮你改成：a.IntValue();

        Integer i7 = null;    //编译器帮你改成：i7.IntValue();
        //int i8 = i7;          //java.lang.NullPointerException:对象为null，我们调用了他的属性或方法

        //包装类的缓存问题
        Integer d1 = 4000;
        Integer d2 = 4000;
        //当数字在[-128,127]之间的时候，返回缓存数组中的某个元素。
        Integer d3 = 123;
        Integer d4 = 123;
        System.out.println(d1 == d2); //false
        System.out.println(d3 == d4); //true
        System.out.println(d1.equals(d2));


    }

}
