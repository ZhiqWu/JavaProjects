package cnn.baizhan;

public class TestSwitch01 {
    public static void main(String[] args) {
        //grade表示大学年级
        int grade = 1;
        switch (grade) {
            case 1:
                System.out.println("大学一年级");
                break;
            case 2:
                System.out.println("大学二年级");
                break;
            case 3:
                System.out.println("大学三年级");
                break;
            case 4:
                System.out.println("大学四年级");
                break;
        }

        int month = 2;
        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("春季");
                break;
        }
    }
}
