package zwu.test.cn.spo;

public class CopyRandomList {
    public Node copyRandomList(Node head) {

        if (head == null) {
            return null;
        }
        Node curr = new Node(0);
        curr.val = head.val;
        Node iter = curr;

        Node temp = head;
        temp = temp.next;
        while (temp != null) {
            Node node = new Node(0);
            node.val = temp.val;
            iter.next = node;
            iter = node;
            temp = temp.next;
        }
        temp = head;
        iter = curr;
        while (temp != null) {

            Node tempHead = head;
            Node currHead = curr;
            if (temp.random != null) {
                while (tempHead != temp.random) {
                    tempHead = tempHead.next;
                    currHead = currHead.next;
                }

                iter.random = currHead;
            }
            iter = iter.next;
            temp = temp.next;
        }
        return curr;
    }
}
