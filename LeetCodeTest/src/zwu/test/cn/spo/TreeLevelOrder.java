package zwu.test.cn.spo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeLevelOrder {
    public int[] levelOrder(TreeNode root) {
        TreeNode node = root;
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if(temp!=null) {
                result.add(temp.val);
                if(temp.left!=null){
                    queue.offer(temp.left);
                }
                if(temp.right!=null){
                    queue.offer(temp.right);
                }

            }
        }
        int[] list=new int[result.size()];
        for(int i=0;i<result.size();++i){
            list[i]=result.get(i);
        }

        return list;


    }

}
