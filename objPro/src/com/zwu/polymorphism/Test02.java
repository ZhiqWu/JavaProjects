package com.zwu.polymorphism;

public class Test02 {

    static void animalCry(Animal a) {
        a.shout();          //多态！！！！
    }

    public static void main(String[] args) {
        Animal a1 = new Cat();  //父类引用指向子类对象，向上可以自动转型
        animalCry(a1);
        Dog d = new Dog();
        animalCry(d);
        animalCry(new Mouse());
    }


}
