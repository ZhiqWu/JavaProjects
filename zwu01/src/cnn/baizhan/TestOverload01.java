/*
 * 测试重载
 * */

package cnn.baizhan;

public class TestOverload01 {

    public static int add() {
        return 0;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        add();
        add(3, 4);
        add(3.1,3.2);
    }
}
