package zwu.test.cn.spo;

public class MinArray {
    public static int minArray(int[] numbers) {
        int pos = 0;
        int len = numbers.length;
        while ((pos + 1) < len && numbers[pos] <= numbers[pos + 1]) {
            pos++;
        }
        if ((pos + 1) < len) {
            pos++;
        }
        return numbers[pos] <= numbers[0] ? numbers[pos] : numbers[0];
    }

    public static void main(String[] args) {
        System.out.println(minArray(new int[]{2, 2, 2, 0, 1}));
    }

}


