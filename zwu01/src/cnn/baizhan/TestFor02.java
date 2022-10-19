package cnn.baizhan;

public class TestFor02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; ++i) {
            for (int j = 1; j <= 5; ++j) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "\t");
            }
            System.out.println();
        }
        for (int i = 9; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "\t");
            }
            System.out.println();
        }
        for (int i = 1; i <= 25; ++i) {
            if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print("# ");
            }
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
