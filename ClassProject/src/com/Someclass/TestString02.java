package com.Someclass;

public class TestString02 {
    public static void main(String[] args) {
        //使用String进行字符串的拼接
        String s1 = "";
        //本质上使用StringBuilder拼接，但是每次循环会生成一个StringBuilder对象
        long num1 = Runtime.getRuntime().freeMemory();//获取系统剩余内存空间
        long time1 = System.currentTimeMillis();//获取系统当前的时间
        for (int i = 0; i < 5000; ++i) {
            s1 = s1 + i;//相当于产生了5000个对象
        }
        long num2 = Runtime.getRuntime().freeMemory();
        long time2 = System.currentTimeMillis();
        System.out.println("String占用内存：" + (num1 - num2));
        System.out.println("String占用时间：" + (time2 - time1));

        //使用StringBuilder进行字符串的拼接
        StringBuilder s2 = new StringBuilder("");
        //本质上使用StringBuilder拼接，但是每次循环会生成一个StringBuilder对象
        long num3 = Runtime.getRuntime().freeMemory();//获取系统剩余内存空间
        long time3 = System.currentTimeMillis();//获取系统当前的时间
        for (int i = 0; i < 5000; ++i) {
            s2.append(i);
        }
        long num4 = Runtime.getRuntime().freeMemory();
        long time4 = System.currentTimeMillis();
        System.out.println("StringBuilder占用内存：" + (num3 - num4));
        System.out.println("StringBuilder占用时间：" + (time4 - time3));


    }
}
