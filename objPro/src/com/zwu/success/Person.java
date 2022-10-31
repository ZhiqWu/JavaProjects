package com.zwu.success;

public class Person extends Object {
    String name;
    int height;

    public void rest() {
        System.out.println("休息！");
    }

    public Person getFriends() {
        return new Person();
    }

    //@Override
    public String toString() {
        return "名字是：" + name + "，身高：" + height;
    }

    public static void main(String[] args) {
        Student s = new Student("张三", 180, 90);
        System.out.println(s instanceof Person);
        System.out.println(s instanceof Student);
        s.rest();
        s.study();
        System.out.println(s.toString());
    }
}

class Student extends Person {
    int score;

    public Student getFriends() {
        return new Student();
    }

    public void study() {
        System.out.println("学习" + this.name);
    }

    public void rest() {
        System.out.println("回宿舍睡觉！");//方法重写
    }

    Student() {
    }

    Student(String name, int height, int score) {
        this.name = name;
        this.height = height;
        this.score = score;
    }
}

class Teacher {
    int teacherId;
    Person person = new Person();

    Teacher(int teacherId, String name, int height) {
        this.teacherId = teacherId;
        this.person.name = name;
        this.person.height = height;
    }
}

class Employee extends Person {

}

