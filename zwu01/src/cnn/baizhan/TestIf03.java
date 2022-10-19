package cnn.baizhan;

public class TestIf03 {
    public static void main(String[] args) {
        int age = (int) (Math.random() * 100);
        System.out.print("年龄：" + age + "，属于");
        if (age <= 15) {
            System.out.println("儿童");
        } else if (age < 30) {
            System.out.println("青年");
        } else if (age < 45) {
            System.out.println("中年");
        } else if (age < 70) {
            System.out.println("老年");
        } else {
            System.out.println("老寿星");
        }
    }
}
