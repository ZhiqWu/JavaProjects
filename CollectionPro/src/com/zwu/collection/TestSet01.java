package com.zwu.collection;
/*
 * 测试HashSet
 * Set没有顺序不可重复
 * List 有顺序可重复
 * */

import java.util.HashSet;
import java.util.Set;

public class TestSet01 {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        s1.add("aa");
        s1.add("bb");
        s1.add("aa");
        System.out.println(s1);

        s1.remove("bb");
        System.out.println(s1);
    }
}
