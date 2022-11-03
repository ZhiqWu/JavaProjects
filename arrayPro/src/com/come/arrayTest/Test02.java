package com.come.arrayTest;

public class Test02 {
    public static void main(String[] args) {
        Man[] mans = {new Man(1, "1111")};
        System.out.println(mans.toString());
    }
}

class Man {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Man() {
    }

    public Man(int id, String name) {
        this.id = id;
        this.name = name;
    }
}