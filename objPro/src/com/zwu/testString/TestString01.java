package com.zwu.testString;

public class TestString01 {
    public static void main(String[] args) {
        String str1 = new String("abcdefg");
        String str2 = "abcdefg";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1 == str2);
        //涉及到字符串比较的时候，用equals
        System.out.println(str1.equals(str2));
    }
}
