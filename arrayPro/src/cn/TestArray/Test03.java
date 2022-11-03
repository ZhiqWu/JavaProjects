package cn.TestArray;

import java.util.Arrays;

/*
 * 测试java.util.Arrays类。
 * 这个类是java提供给我们操作数组的工具类。
 * 提供了常见的：排序、查找、填充、打印数组内容的相关方法。
 * */
public class Test03 {
    public static void main(String[] args) {
        int[] a = {100, 200, 300, 1, 3, 5, 7, 6};
        //测试打印
        System.out.println(Arrays.toString(a));
        //测试排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
