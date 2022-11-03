package com.come.arrayTest;

public class Test02 {
    public static void main(String[] args) {
        Man[] mans=new Man[5];
        mans={};
    }
}

class Man{
    private int id;
    private int name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
    public Man(){}

    public Man(int id, int name) {
        this.id = id;
        this.name = name;
    }
}