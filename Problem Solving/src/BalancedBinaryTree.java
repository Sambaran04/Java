public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(check(root)==-1){
            return false;
        }
        else{
            return true;
        }
    }
    public int check(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = check(root.left);
        int rh = check(root.right);

        if(lh==-1 || rh==-1) return -1;
        if(Math.abs(lh-rh)>1) return -1;

        return 1+Math.max(lh, rh);
    }
}
