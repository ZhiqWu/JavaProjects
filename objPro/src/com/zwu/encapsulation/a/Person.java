package com.zwu.encapsulation.a;

public class Person {
    private int testPrivate = 200;
    int testDefault = 101;
    protected int testProtect = 102;
    public int testPublic = 1222;

    public void test() {
        this.testPrivate = 100;
        System.out.println(this.testPrivate);

    }
}
