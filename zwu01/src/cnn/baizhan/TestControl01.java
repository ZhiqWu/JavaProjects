package cnn.baizhan;

public class TestControl01 {
    public static void main(String[] args) {
        int total = 0;//定义计数器
        System.out.println("Begin");
        while (true) {
            total++;
            int i = (int) Math.round(100 * Math.random());
            if (i == 88) {
                break;
            }
        }
        System.out.println("循环的次数为：" + total);

        outer:
        for (int i = 101; i < 150; ++i) {
            for (int j = 2; j < i / 2; ++j) {
                if (i % j == 0) {
                    continue outer;
                }
            }
            System.out.print(i + " ");
        }
    }
}
