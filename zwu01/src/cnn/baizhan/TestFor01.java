package cnn.baizhan;

public class TestFor01 {
    public static void main(String[] args) {
        for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i= " + i + " j= " + j);
        }
        int m = 1, n = m + 10;
        while (m < 5) {
            System.out.println("m= " + m + " n= " + n);
            m++;
            n = m + 10;
        }
//        while(true){
//            System.out.println("爱你一万年");
//        }
        for(;;){
            System.out.println("爱你一万年");
        }
    }
}
