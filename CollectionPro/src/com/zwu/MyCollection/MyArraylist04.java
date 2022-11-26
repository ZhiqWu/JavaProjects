package com.zwu.MyCollection;

/*
 * 自定义实现一个ArrayList，体会底层原理
 * 增加数组扩容
 * */

public class MyArraylist03<E> {
    private Object[] elementData;
    private int size;

    private static int DEFAULT_CAPACITY = 10;

    public MyArraylist03() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArraylist03(int capacity) {
        elementData = new Object[capacity];
    }

    public void add(E element) {
        //什么时候扩容？
        if (size == elementData.length) {
            //扩容操作
            Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];//10-->10+10/2
            System.arraycopy(elementData, 0, newArray, 0, elementData.length);
            elementData = newArray;
        }
        elementData[size++] = element;
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
        MyArraylist03<String> s1 = new MyArraylist03<>(20);
        s1.add("aa");
        s1.add("bb");
        for (int i = 0; i < 40; ++i) {
            s1.add("zz");
        }

        System.out.println(s1);
    }

}
