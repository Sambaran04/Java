import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal_Iterative {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        if (root==null) return ans;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            root = stack.pop();
            ans.add(root.val);
            if (root.right!=null) stack.push(root.right);
            if (root.left!=null) stack.push(root.left);
        }
        return ans;
    }
}
