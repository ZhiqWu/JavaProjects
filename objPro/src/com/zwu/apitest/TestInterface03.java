package com.zwu.apitest;

public class TestInterface03 {
    public static void main(String[] args) {
        TestC t1 = new TestC();
        t1.testa01();
        t1.testb01();
        t1.testc01();
    }
}

interface A01 {
    void testa01();
}

interface B01 {
    void testb01();
}

interface C01 extends A01, B01 {
    void testc01();
}

class TestC implements C01 {
    @Override
    public void testa01() {
        System.out.println("TestC.testa01");
    }

    @Override
    public void testb01() {
        System.out.println("TestC.testb01");
    }

    @Override
    public void testc01() {
        System.out.println("TestC.testc01");
    }
}

