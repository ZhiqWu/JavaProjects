package com.uu;
/*
 * 测试调试视图
 * */

public class Test06 {

    private int num = 10;

    public void run(int a) {
        num = a * num;
        System.out.println(num);
        go();
    }

    public void go() {
        System.out.println("Test06.go");
    }

    public static void main(String[] args) {
        Test06 t = new Test06();
        t.run(4);

    }
}
