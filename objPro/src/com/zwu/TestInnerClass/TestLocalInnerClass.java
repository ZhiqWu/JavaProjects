package com.zwu.TestInnerClass;
/*
 * 测试局部内部类
 * */

public class TestLocalInnerClass {
    public void show() {
        //作用域仅限于该方法
        class Inner3 {
            public void fun() {
                System.out.println("啦啦啦！");
            }
        }
        new Inner3().fun();
    }

    public static void main(String[] args) {
        new TestLocalInnerClass().show();
    }
}
