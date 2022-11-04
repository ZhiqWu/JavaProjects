package com.ComparableTest;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        Man[] msMans = {
                new Man(3, "a"),
                new Man(60, "b"),
                new Man(15, "c")
        };
        Arrays.sort(msMans);
        System.out.println(Arrays.toString(msMans));
    }
}

class Man implements Comparable {
    int age;
    int id;
    String name;

    public Man(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Man man = (Man) o;
        if (this.age < man.age) {
            return -1;
        }
        if (this.age > man.age) {
            return 1;
        }
        return 0;
    }
}