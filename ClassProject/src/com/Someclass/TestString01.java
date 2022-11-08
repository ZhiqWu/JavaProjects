package com.Someclass;
/*
 * String类不可变相关序列
 * StringBuilder类、StringBuffer类是可变相关序列
 * */

public class TestString01 {
    public static void main(String[] args) {
        String str = "abbb";            //不可变字符序列
        StringBuilder sb = null;        //可变字符序列，线程不安全，效率高
        StringBuffer sb2 = null;        //可变字符序列，线程安全，效率低

        sb = new StringBuilder("gao");
        sb.append(123);
        sb.append("456");
        System.out.println(sb);
        sb.append("aa").append("bb").append("cc");
        System.out.println(sb);

        for (int i = 0; i < 10; ++i) {
            sb.append(i);
        }
        System.out.println(sb);

        sb2 = new StringBuffer("haha");
        sb2.insert(0, "爱").insert(0, "你");
        System.out.println(sb2);
        sb2.delete(0, 2);
        System.out.println(sb2);

    }
}

