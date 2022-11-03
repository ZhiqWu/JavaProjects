package com.come.arrayTest;

public class Test01 {
    public static void main(String[] args) {
        //int[] arr1 = null;
        int[] arr1 = new int[5]; //默认初始化，数组元素相当于对象的属性，遵守对象属性默认初始化的规则。
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        //数组遍历，动态初始化
        for (int i = 0; i < 5; ++i) {
            arr1[i] = i + 1;
            System.out.println(arr1[i]);
        }
        System.out.println(arr1.length);

        int arr2[] = {20, 30, 40};  //静态初始化
        for (int i = 0; i < arr2.length; ++i) {
            System.out.println(arr2[i]);
        }
        System.out.println(arr2.toString());

    }
}
