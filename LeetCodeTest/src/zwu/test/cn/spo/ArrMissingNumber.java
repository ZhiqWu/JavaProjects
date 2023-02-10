package zwu.test.cn.spo;

public class ArrMissingNumber {
    public int missingNumber(int[] nums) {
        int pos=0;
        for(int i : nums){
            if(i!=pos){
                break;
            }
            pos++;
        }
        return pos;

    }
}
