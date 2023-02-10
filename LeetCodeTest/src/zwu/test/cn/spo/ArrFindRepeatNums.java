package zwu.test.cn.spo;

public class ArrFindRepeatNums {
    public int findRepeatNumber(int[] nums) {
        int result = 0;
        int[] countNums = new int[100001];
        for (int i : nums) {
            countNums[i]++;
        }
        for (int i = 0; i < 100001; ++i) {
            if (countNums[i] > 1) {
                result = i;
                break;
            }
        }
        return result;
    }
}
