package com.zwu.collection;
/*
 * 测试迭代器遍历List、Set、Map
 * */

import java.util.*;

public class TestIterator {
    public static void main(String[] args) {
        testIteratorList();
        testIteratorSet();
        testIteratorMap();

    }

    public static void testIteratorList() {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");

        //使用iterator遍历List
        for (Iterator<String> iter = list.iterator(); iter.hasNext(); ) {
            String temp = iter.next();
            System.out.println(temp);

        }

    }

    public static void testIteratorSet() {
        Set<String> set = new HashSet<>();
        set.add("aa");
        set.add("bb");
        set.add("cc");

        //使用iterator遍历Set
        for (Iterator<String> iter = set.iterator(); iter.hasNext(); ) {
            String temp = iter.next();
            System.out.println(temp);
        }

    }

    public static void testIteratorMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "aa");
        map.put(20, "bb");
        map.put(30, "cc");

        Set<Map.Entry<Integer, String>> ss = map.entrySet();

        //第一种遍历Map方式
        for (Iterator<Map.Entry<Integer, String>> iter = ss.iterator(); iter.hasNext(); ) {
            Map.Entry<Integer, String> temp = iter.next();
            System.out.println(temp.getKey() + "---" + temp.getValue());
        }
        //第二种遍历Map方式
        Set<Integer> keySet = map.keySet();
        for (Iterator<Integer> iter = keySet.iterator(); iter.hasNext(); ) {
            Integer key = iter.next();
            System.out.println(key + "-----" + map.get(key));
        }
    }

}
