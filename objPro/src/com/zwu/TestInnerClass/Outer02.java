package com.zwu.TestInnerClass;

/*
 * 测试静态内部类
 * */
public class Outer02 {
    private int a = 10;
    private static int b = 20;

    static class Inner02 {
        public void test() {
//          System.out.println(a);  //静态内部类不能访问外部类的普通属性
            System.out.println(b);  //静态内部类可以访问外部类的静态属性
        }
    }

    public static void main(String[] args) {
        Outer02.Inner02 inner = new Outer02.Inner02();
        inner.test();
    }
}
