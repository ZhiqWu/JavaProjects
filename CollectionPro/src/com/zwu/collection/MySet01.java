package com.zwu.collection;

import java.util.HashMap;

/*
 * 手动实现一个HashSet，更深刻理解HashSet
 * */
public class MySet01 {
    HashMap map;
    private static final Object PRESENT = new Object();

    public MySet01() {
        map = new HashMap();
    }

    public int size() {
        return map.size();
    }

    public void add(Object o) {
        map.put(o, PRESENT);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (Object key : map.keySet()) {
            sb.append(key + ",");
        }
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }

    public static void main(String[] args) {
        MySet01 s = new MySet01();
        s.add("a");
        s.add("b");
        s.add("c");
        System.out.println(s);

    }

}
