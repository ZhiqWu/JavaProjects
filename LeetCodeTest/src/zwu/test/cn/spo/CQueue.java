package zwu.test.cn;

import java.util.Stack;

public class CQueue {
     Stack<Integer> st1 = new Stack<Integer>();
    Stack<Integer> st2 = new Stack<Integer>();

    public CQueue() {

    }

    public void appendTail(int value) {
        st1.push(value);
    }

    public int deleteHead() {
        if (st1.empty()!=true && st2.empty()) {
            while(st1.empty()!=true){
                int temp=st1.pop();
                st2.push(temp);
            }
        }
        if(st2.empty()!=true){
            return st2.pop();
        }else{
            return -1;
        }
    }
}
