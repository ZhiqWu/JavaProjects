package zwu.test.cn.spo;

public class StringReplaceSpace {
    public String replaceSpace(String s) {
        StringBuilder str=new StringBuilder(s);
        while(str.indexOf(" ")!=-1){
            int pos=str.indexOf(" ");
            str.deleteCharAt(pos);
            str.insert(pos,"%20");
        }
        return str.toString();

    }
}
