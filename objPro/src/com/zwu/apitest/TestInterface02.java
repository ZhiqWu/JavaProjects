package com.zwu.apitest;

public class TestInterface02 {
    public static void main(String[] args) {
        A a = new TestA();
        a.moren(); //默认方法相当于类中的普通方法
        A.staticMethod();
        TestA.staticMethod();
    }
}

interface A{
    default void moren(){
        System.out.println("我是A中的默认方法！");
    }
    public static void staticMethod(){
        System.out.println("A中的静态方法！");
    }
}

class TestA implements A{
    @Override
    public void moren() {
        /*A.super.moren();*/
        System.out.println("AAAA");
    }
    public static void staticMethod(){
        System.out.println("TestA中的静态方法！");
    }
}