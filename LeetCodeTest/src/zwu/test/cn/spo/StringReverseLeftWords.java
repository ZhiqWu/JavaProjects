package zwu.test.cn.spo;

public class StringReverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        StringBuilder str = new StringBuilder(s);
        StringBuilder str1 = new StringBuilder(str.substring(0, n - 1));
        str.delete(0, n - 1);
        str.append(str1);
        return str.toString();

    }
}
