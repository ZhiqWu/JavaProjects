package com.zwu.MyCollection;

/*
 * 自定义实现一个ArrayList，体会底层原理
 * */

public class MyArraylist01 {
    private Object[] elementData;
    private int size;

    private static int DEFAULT_CAPACITY = 10;

    public MyArraylist01() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArraylist01(int capacity) {
        elementData = new Object[capacity];
    }

    public void add(Object obj) {
        elementData[size++] = obj;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; ++i) {
            sb.append(elementData[i] + ",");
        }
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }

    public static void main(String[] args) {
        MyArraylist01 s1 = new MyArraylist01(2);
        s1.add("aa");
        s1.add("bb");
        System.out.println(s1);
    }

}
