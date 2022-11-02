package com.zwu.testString;

public class TestString01 {
    public static void main(String[] args) {
        String str1 = new String("abcdefg");
        String str2 = "abcdefg";
        String str3 = "abcdEFG";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1 == str2);
        //涉及到字符串比较的时候，用equals
        System.out.println(str1.equals(str2));
        System.out.println(str1.length());  //7
        System.out.println(str2.charAt(0));
        System.out.println(str2.charAt(6));
        System.out.println(str2.charAt(str2.length() - 1));
        System.out.println(str2.equals(str3));
        System.out.println(str2.equalsIgnoreCase(str3));

        //从开头到结尾查找，，返回找到的第一个子字符串的索引位置。如未找到，返回-1
        System.out.println(str2.indexOf("def"));    //3
        System.out.println(str2.indexOf("DE"));     //-1
        //从末尾开始查找
        System.out.println("abcdefghijk".lastIndexOf("jk"));

        String str5 = "abcdbcd".replace('d', 'D');
        System.out.println(str5);
        String str6 = "abcdbcd".replace("d", "Hello");
        System.out.println(str6);

        System.out.println("baby,i love u".startsWith("baby")); //true
        System.out.println("baby,i love u".endsWith("baby")); //false

        //截取子字符串
        String str7 = "abcdefghijklmnopqrstuvwxyz".substring(6);
        System.out.println(str7);
        //包头不包尾
        String str8 = "abcdefghijklmnopqrstuvwxyz".substring(6, 11);
        System.out.println(str8);

        System.out.println("abcdE".toUpperCase());
        System.out.println("abcdE".toLowerCase());
        System.out.println(" a bs   ".trim());
        //Stirng是不可变字符序列。所有的替换，截取子字符串，去空格，转换大小写等都是生成了新字符串
        System.out.println("  a b   s ".replace(" ",""));


    }
}
