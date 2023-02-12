package zwu.test.cn.spo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeLevelOrder3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        TreeNode node = root;
        Queue<TreeNode> queueEven = new LinkedList<>();
        Queue<TreeNode> queueOdd = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();

        if (node != null) {
            queueEven.offer(node);
            queueOdd.offer(node);
        }
        int count = 0;

        while (!queueEven.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            for (int i = queueEven.size(); i > 0; --i) {
                TreeNode evenNode = queueEven.poll();
                TreeNode oddNode = queueOdd.poll();
                if(count%2==0) {
                    temp.add(evenNode.val);
                }else{
                    temp.add(oddNode.val);
                }
                if (evenNode.left != null) {
                    queueEven.add(evenNode.left);
                }
                if (evenNode.right != null) {
                    queueEven.add(evenNode.right);
                }
                if (oddNode.right != null) {
                    queueOdd.add(oddNode.right);
                }
                if (oddNode.left != null) {
                    queueOdd.add(oddNode.left);
                }
            }
            count++;
            result.add(temp);
        }



        return result;
    }

}
