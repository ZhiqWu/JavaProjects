package cnn.baizhan;

public class TestRecursion01 {
    public static void a() {
        System.out.println("a");
        b();
    }

    public static void b() {
        System.out.println("b");
    }

    public static int num = 10;

    public static void c() {
        num--;
        System.out.println("c");
        if (num > 0) {
            c();
        }
    }

    static long factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        a();
        c();
        long d1 = System.currentTimeMillis();
        System.out.printf("%d阶乘的结果:%s%n",10,factorial(10));
        long d2 = System.currentTimeMillis();
        System.out.printf("递归耗时%d",d2-d1);

    }

}
