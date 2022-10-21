package cnn.baizhan;

import java.util.Scanner;

public class TestControl02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("我的年薪计算器小软件");
        System.out.println("exit退出程序;next计算下一个年薪");

        while (true) {
            System.out.println("请输入月薪");
            int monthSalary = scanner.nextInt();
            System.out.println("请输入一年多少个月薪资：");
            int months = scanner.nextInt();
            int yearSalary = monthSalary * months;
            System.out.println("请输入命令exit或next. 其他任意字符表示继续执行：");
            scanner.nextLine();

            String command = scanner.nextLine();
            System.out.println(command+"=========================");
            if("exit".equals(command)){
                System.out.println("退出软件");
                break;
            } else if ("next".equals(command)) {
                System.out.println("重新输入新的数据：");
                continue;

            }

            if (yearSalary > 10 && yearSalary < 20) {
                System.out.println("恭喜你超过了90%的国人");
            } else if (yearSalary > 20) {
                System.out.println("恭喜你超过了98%的国人");
            }

            System.out.println("年薪是：" + yearSalary);

        }

    }
}
