import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (root==null){
            return ans;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> level = new LinkedList<>();
            int size = queue.size();
            for (int i=0; i<size; i++){
                if (queue.peek().left !=null) queue.add(queue.peek().left);
                if (queue.peek().right !=null) queue.add(queue.peek().right);
                level.add(queue.poll().val);
            }
            ans.add(level);
        }
        return ans;
    }
}
