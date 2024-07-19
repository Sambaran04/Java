import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;
    }
    public void inorder(TreeNode root, List<Integer> ans){
        if(root!=null){
            inorder(root.left, ans);
            ans.add(root.val);
            inorder(root.right, ans);
        }
    }
}
