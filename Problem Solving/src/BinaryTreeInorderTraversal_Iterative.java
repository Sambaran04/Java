import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal_Iterative {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        if (root==null) return ans;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (true){
            if (node != null){
                stack.push(node);
                node = node.left;
            }
            else {
                if (stack.isEmpty()) break;
                node = stack.pop();
                ans.add(root.val);
                node = node.right;
            }
        }
        return ans;
    }
}
