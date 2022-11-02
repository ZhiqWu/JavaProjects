package com.zwu.apitest;

//接口可以彻底把规范和具体实现区分开
public class TestInterface01 {
    public static void main(String[] args) {
        Angel angel = new Angel();
        angel.fly();
        angel.helpOthers();

        Volant m1 = new Angel();
        m1.fly();
        Goodman m2 = (Goodman) m1;
        m2.helpOthers();
    }
}

/*
 * 这是一个飞行器的接口
 * */
interface Volant {
    //飞行器最大飞行高度
    int fly_height = 100;//总是：public static final类型的

    //飞行器飞行接口。调用它，可以起飞。
    void fly();         //总是：public abstract void fly();
}

interface Goodman {
    void helpOthers();
}

class Angel implements Volant, Goodman {
    @Override
    public void fly() {
        System.out.println("完美天使，飞行中！");
    }

    @Override
    public void helpOthers() {
        System.out.println("帮助别人很快乐！");
    }
}