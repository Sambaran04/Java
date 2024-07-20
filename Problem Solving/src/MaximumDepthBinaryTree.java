import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return 1+Math.max(lh, rh);
    }

    public int maxDepthBFS(TreeNode root){
        if (root==null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level=0;
        while (!queue.isEmpty()){
            for (int i = 0; i < queue.size(); i++) {
                TreeNode node = queue.poll();
                if (node.left !=null) queue.add(node.left);
                if (node.right !=null) queue.add(node.right);
            }
            level++;
        }
        return level;
    }
}
