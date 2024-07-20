import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal_Iterative {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        if (root==null) return ans;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()){
            root = stack1.pop();
            stack2.push(root);
            if (root.left!=null) stack1.push(root.left);
            if (root.right!=null) stack1.push(root.right);
        }
        while (!stack2.isEmpty()){
            ans.add(stack2.pop().val);
        }
        return ans;
    }
}
