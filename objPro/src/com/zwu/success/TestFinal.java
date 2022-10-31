package com.zwu.success;

public class TestFinal {


    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.shout();
        Taidi t = new Taidi();
        t.dog.shout();
        t.dog.height = 101;
    }
}

class Animal {
    public/* final */void shout() {
        System.out.println("叫了一声");
    }
}

class Dog extends Animal {
    int height;

    public void shout() {
        System.out.println("汪汪汪！");
    }
}

class Taidi {//组合
    Dog dog = new Dog();
}