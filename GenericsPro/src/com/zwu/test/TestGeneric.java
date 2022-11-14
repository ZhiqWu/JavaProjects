package com.zwu.test;
/*
* 测试泛型
* */

public class TestGeneric {
    public static void main(String[] args) {
        MyCollection<String> mc = new MyCollection<>();
        mc.set("徐厚", 0);

        String b = (String) mc.get(0);
    }

}

class MyCollection<E> {
    Object[] objs = new Object[5];

    public void set(E obj, int index) {
        objs[index] = obj;
    }

    public E get(int index) {
        return (E)objs[index];
    }
}