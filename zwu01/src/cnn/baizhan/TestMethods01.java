package cnn.baizhan;

public class TestMethods01 {

    public static int late(int lateMinutes, double salary) {
        int fine = 0;               //罚款

        if (lateMinutes < 11) {
            System.out.println("警告！！不能迟到！！");
        } else if (lateMinutes < 21) {
            fine = 100;
        } else if (lateMinutes < 31) {
            fine = 200;
        } else if (lateMinutes < 61) {
            fine = (int) salary / 20 / 2; //除以半日工资
        } else {
            fine = (int) salary / 20 * 3; //扣3日工资
        }
        System.out.println("迟到时间：" + lateMinutes + "罚款：" + fine);
        return fine;
    }

    public static void main(String[] args) {
        late(70, 42000);
    }
}
