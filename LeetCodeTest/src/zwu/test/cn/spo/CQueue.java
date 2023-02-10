package zwu.test.cn.spo;

import java.util.Stack;

public class CQueue {
    private Stack<Integer> stIn;
    private Stack<Integer> stOut;

    public CQueue() {
        stIn = new Stack<>();
        stOut = new Stack<>();
    }

    public void appendTail(int value) {
        stIn.push(value);
    }

    public int deleteHead() {
        if (stIn.empty() && stOut.empty()) {
            return -1;
        }

        if (stOut.empty()) {
            while (!stIn.empty()) {
                stOut.push(stIn.pop());
            }
        }
        return stOut.pop();
    }
}
