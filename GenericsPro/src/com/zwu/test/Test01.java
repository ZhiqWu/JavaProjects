package com.zwu.test;

/*
* 测试泛型类
* */

public class Test01 {
    public static void main(String[] args) {
        Generic<String> generic = new Generic<>();
        generic.setFlag("你好吗？");
        System.out.println(generic.getFlag());

        Generic<Integer> generic1 = new Generic<>();
        generic1.setFlag(11);
        System.out.println(generic1.getFlag());

    }
}

class Generic<T> {
    private T flag;

    public void setFlag(T flag) {
        this.flag = flag;
    }

    public T getFlag() {
        return this.flag;
    }
}