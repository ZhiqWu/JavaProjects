package com.zwu.encapsulation.b;

import com.zwu.encapsulation.a.Person;

public class Teacher extends Person {

    public void test() {
        System.out.println(super.testProtect);
    }

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println();
    }
}
