package com.zwu.TestInnerClass;

//测试匿名内部类
public class TestAnonymousInnerClass {

    public void test(A a) {
        a.run();
    }

    public static void main(String[] args) {
        TestAnonymousInnerClass tai = new TestAnonymousInnerClass();
        tai.test(new A() {
            @Override
            public void run() {
                System.out.println("TestAnonymousInnerClass.run");
            }
        });

        tai.test(new A() {
            @Override
            public void run() {
                System.out.println("哈哈！");
            }
        });
    }
}

//有名字的类，可以反复使用
class AA implements A {
    @Override
    public void run() {
        System.out.println("AA.run");
    }
}

interface A {
    void run();
}