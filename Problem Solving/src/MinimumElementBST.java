public class MinimumElementBST {
    int minValue(TreeNode root) {
        if(root==null){
            return -1;
        }
        while(root.left!=null){
            root = root.left;
        }
        return root.val;
    }
}
