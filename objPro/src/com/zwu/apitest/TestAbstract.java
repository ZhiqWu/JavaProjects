package com.zwu.apitest;

public class TestAbstract {
    public static void main(String[] args) {
        Dog a=new Dog();
        a.shout();
        a.seeDoor();
    }
}

abstract class Animal{
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    abstract public void shout();   //抽象方法

    Animal(){}
    public Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal{
    //子类必须实现父类的抽象方法，否则编译错误
    public void shout(){
        System.out.println("汪汪汪！");
    }
    public void seeDoor(){
        System.out.println("看门中！");
    }
}
