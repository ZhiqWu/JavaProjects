package com.zwu.collection;
/*
 * 测试Collection接口中的方法
 * */

import java.util.ArrayList;
import java.util.Collection;

public class TestList {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        System.out.println(c.size());
        System.out.println(c.isEmpty());
        c.add("武老大");
        c.add("吴老大");
        System.out.println(c);
        System.out.println(c.size());
        System.out.println(c.contains("高老三"));
        System.out.println(c.contains("武老大"));

        Object[] objs = c.toArray();
        System.out.println(objs);

        c.remove("武老大");
        System.out.println(c);
        c.clear();
        System.out.println(c.size());
        System.out.println(c);


    }
}
