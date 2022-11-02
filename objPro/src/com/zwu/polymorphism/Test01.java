package com.zwu.polymorphism;

public class Test01 {
    public static void main(String[] args) {

    }
}

class Animal{
    public void shout(){
        System.out.println("叫了一声！");
    }
}

class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("汪汪汪！");
    }
}

class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("喵喵喵！");
    }
}

class Mouse extends Animal{
    @Override
    public void shout() {
        super.shout();
    }
}