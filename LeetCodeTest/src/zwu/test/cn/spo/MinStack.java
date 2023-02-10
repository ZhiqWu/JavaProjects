package zwu.test.cn.spo;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> minSt;



    public MinStack() {
        st = new Stack<>();
        minSt=new Stack<>();
        minSt.push(2147483647);
    }

    public void push(int x) {
        st.push(x);
        minSt.push(Math.min(x,minSt.peek()));
    }

    public void pop() {
        st.pop();
        minSt.pop();
    }

    public int top() {
        return st.peek();
    }

    public int min() {
        return minSt.peek();
    }
}
