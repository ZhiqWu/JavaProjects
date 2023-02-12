package zwu.test.cn.spo;

public class CharFirstUniqChar {
    public char firstUniqChar(String s) {
        StringBuilder str = new StringBuilder(s);
        char result = ' ';
        int[] countNums=new int[256];
        for (int i = 0; i < str.length(); ++i) {
           countNums[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); ++i) {
            if(countNums[str.charAt(i)]==1){
                return str.charAt(i);
            }
        }

        return result;
    }
}
