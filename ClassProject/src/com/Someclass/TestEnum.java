package com.Someclass;

/*
 * 枚举：将需要列举的常量列举出来
 * */

import java.util.Random;

public class TestEnum {
    public static void main(String[] args) {
        //System.out.println(Season.Spring);
        for (Season s : Season.values()) {
            System.out.println(s);
        }
        Week[] ws = Week.values();
        System.out.println(ws[0]);
        int a=new Random().nextInt(4);//0,1,2,3 (int)Math.random()*4


        switch (Season.values()[a]){
            case Spring:
                System.out.println("春天！");
                break;
            case Summer:
                System.out.println("夏天！");
                break;
            case Autumn:
                System.out.println("秋天！");
                break;
            case Winter:
                System.out.println("冬天！");
                break;
        }
    }
}

enum Season {
    Spring, Summer, Autumn, Winter
}

enum Week {
    星期一, 星期二, 星期三, 星期四, 星期五, 星期六, 星期日
}

class MySeason {
    public static final int SPRING = 0;
    public static final int SUMMER = 1;
    public static final int AUTUMN = 2;
    public static final int WINTER = 3;

    public void PrintSeason() {
        System.out.println(MySeason.SPRING);
        System.out.println(MySeason.AUTUMN);
        System.out.println(MySeason.SUMMER);
        System.out.println(MySeason.WINTER);
    }
}
