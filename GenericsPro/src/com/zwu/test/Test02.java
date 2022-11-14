package com.zwu.test;

/*
 * 测试泛型接口
 * */

public class Test02 {
    public static void main(String[] args) {
        IgenericImpl igeneric = new IgenericImpl();
        String name = igeneric.getName("原子");
        System.out.println(name);

        Igeneric<String> igeneric1 = new IgenericImpl();
        String name1 = igeneric1.getName("haha");
        System.out.println(name1);


    }
}

interface Igeneric<T> {
    T getName(T name);
}

class IgenericImpl implements Igeneric<String> {
    @Override
    public String getName(String name) {
        return name;
    }
}
