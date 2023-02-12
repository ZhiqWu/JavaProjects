package zwu.test.cn.spo;

import java.util.*;

public class TreeLevelOrder2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        TreeNode node = root;
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();

        if (node != null) {
            queue.offer(node);
        }
        while (!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            for (int i = queue.size(); i > 0; --i) {
                TreeNode tempNode = queue.poll();
                temp.add(tempNode.val);
                if (tempNode.left != null) {
                    queue.add(tempNode.left);
                }
                if (tempNode.right != null) {
                    queue.add(tempNode.right);
                }
            }
            result.add(temp);
        }

        return result;
    }

}
