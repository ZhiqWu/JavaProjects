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
    }
}
