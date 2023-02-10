package zwu.test.cn.spo;

import java.util.Arrays;

public class ReversePrintList {
    public int[] reversePrint(ListNode head) {
        int[] arr = new int[10001];
        int size = -1;
        ListNode temp = head;
        while (temp!= null) {
            size++;
            temp = temp.next;
        }
        int length = size + 1;
        temp = head;
        while (temp != null) {
            arr[size--] = temp.val;
            temp = temp.next;
        }
        int result[] = (int[]) Arrays.copyOfRange(arr, 0, length);

        return result;
    }
}
