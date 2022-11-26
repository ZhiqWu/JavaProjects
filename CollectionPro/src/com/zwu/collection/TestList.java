package com.zwu.collection;
/*
 * 测试Collection接口中的方法
 * */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        test03();
    }

    public static void test01() {
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

    public static void test02() {
        //测试集合操作
        List<String> list01 = new ArrayList<>();
        list01.add("aa");
        list01.add("bb");
        list01.add("cc");

        List<String> list02 = new ArrayList<>();
        list02.add("aa");
        list02.add("dd");
        list02.add("ee");

        System.out.println("list01: " + list01);
        //list01.addAll(list02);    //并集
        //list01.removeAll(list02); //
        list01.retainAll(list02);   //交集

        System.out.println("list01: " + list01);
        System.out.println(list01.contains(list02));


    }

    public static void test03() {
        //测试索引相关方法
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("A");

        System.out.println(list);
        list.add(2, "xiao");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
        list.set(2, "gaolaoer");
        System.out.println(list);
        System.out.println(list.indexOf("A"));
        System.out.println(list.lastIndexOf("A"));


    }

}
