package com.zwu.TestArray;

public class Test01 {
    public static void main(String[] args) {
        int[] s = null; //声明数组
        s = new int[10];//给数组分配空间
        for (int i = 0; i < 10; ++i) {
            s[i] = i + 1;//给数组元素赋值；数组是对象，数组中的元素就是对象的属性。
            System.out.println(s[i]);
        }
    }
}
