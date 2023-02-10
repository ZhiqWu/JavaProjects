package zwu.test.cn.spo;

public class ArrSearch {
    public int search(int[] nums, int target) {
        int count = 0;
        for (int i : nums) {
            if (i == target) {
                count++;
            }
        }
        return count;
    }
}
