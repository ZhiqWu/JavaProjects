package com.Someclass;

/*
 * 定义一个简单的包装类并不难
 * */
public class TestWrapperClass02 {
    public static void main(String[] args) {
        MyInteger m = MyInteger.valueOf(300);
        System.out.println(m);

    }
}

class MyInteger {
    private int value;
    private static MyInteger[] cache = new MyInteger[256];
    public static final int Low = -128;
    public static final int High = 127;


    static {
        //[-128,127]
        for (int i = Low; i <= High; ++i) {
            cache[i + 128] = new MyInteger(i);
        }
    }

    @Override
    public String toString() {
        return this.value + "";
    }

    public static MyInteger valueOf(int i) {
        if (i >= Low && i <= High) {
            return cache[i + 128];
        }
        return new MyInteger(i);
    }

    private MyInteger(int i) {
        this.value = i;
    }

}
