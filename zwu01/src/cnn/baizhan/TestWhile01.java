package cnn.baizhan;

public class TestWhile01 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        //1+2+……+100=5050
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);
        int a = 1;
        while (a <= 3) {
            System.out.println("I love U!" + a);
            a++;
        }
        System.out.println(a);

        int a1 = 0;
        int sumOdds = 0;
        int sumEvens = 0;
        while (a1 <= 100) {
            if (a1 % 2 == 0) {
                sumEvens += a1;
            } else {
                sumOdds += a1;
            }
            a1++;
        }
        System.out.println("100以内的奇数和为：" + sumOdds);
        System.out.println("100以内的偶数和为：" + sumEvens);
        a1 = 1;
        while(a1<=100) {

            System.out.print(a1+" ");
            if(a1%7==0) {
                System.out.print("\n");
            }
            a1++;
        }
    }
}
