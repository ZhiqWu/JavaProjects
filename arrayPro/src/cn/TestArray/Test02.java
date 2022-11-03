package cn.TestArray;

public class Test02 {
    public static void main(String[] args) {
        String[] s1 = {"小花", "小明", "小白"};
        String[] s2 = new String[4];
        //数组拷贝
        System.arraycopy(s1, 0, s2, 1, s1.length);
        for (int i = 0; i < s2.length; ++i) {
            System.out.print(s2[i] + "\t");
        }
    }
}
