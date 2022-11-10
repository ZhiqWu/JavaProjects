package com.uu;

/*
* 自定义异常
* illegalAgeException:非法年龄异常，继承Exception类
* */

public class Test05 {
    public static void main(String[] args) {

    }
}

class IllegalAgeException extends Exception{
    //默认构造器
    public IllegalAgeException(){

    }
    //带有详细信息的构造器，信息存储在message中
    public IllegalAgeException(String message){
        super(message);
    }
}
