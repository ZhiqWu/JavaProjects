package com.zwu.success;

public class Person /*extends Object*/ {
    String name;
    int height;

    public void rest() {
        System.out.println("休息！");
    }

    public static void main(String[] args) {
        Student s = new Student("张三", 180, 90);
        System.out.println(s instanceof Person);
        System.out.println(s instanceof Student);
    }

}

class Student extends Person {
    int score;

    public void study() {
        System.out.println("学习" + this.name);
    }

    Student(String name, int height, int score) {
        this.name = name;
        this.height = height;
        this.score = score;
    }
}

