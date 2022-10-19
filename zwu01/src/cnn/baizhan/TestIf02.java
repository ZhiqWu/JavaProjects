package cnn.baizhan;

public class TestIf02 {
    public static void main(String[] args) {
        double r = Math.random() * 4;
        double area = Math.PI * r * r;
        double circle = 2 * Math.PI * r;
        System.out.println("面积是：" + area);
        System.out.println("周长是：" + circle);
        if (area >= circle) {
            System.out.println("面积的数值大于周长");
        } else {
            System.out.println("面积的数值小于周长");
        }
    }
}
