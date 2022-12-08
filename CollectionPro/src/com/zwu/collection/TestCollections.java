package com.zwu.collection;
/*
 * Collections辅助类的使用测试
 * Collection是接口，Collections是工具类
 * */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            list.add("zwu----" + i);
        }
        System.out.println(list);

        Collections.shuffle(list);//随机排列
        System.out.println(list);

        Collections.reverse(list);//逆序
        System.out.println(list);

        Collections.sort(list);//递增.自定义类的使用：comparable接口。
        System.out.println(list);

        System.out.println(Collections.binarySearch(list, "张三"));//采用二分法进行查找
        System.out.println(Collections.binarySearch(list, "zwu----5"));//采用二分法进行查找

    }
}
