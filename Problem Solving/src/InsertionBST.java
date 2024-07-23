public class InsertionBST {
    public static void main(String[] args) {

    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root==null) return new TreeNode(val);
        TreeNode curl = root;
        while (true){
            if(curl.val<=val){
                if (curl.right!=null){
                    curl = curl.right;
                }
                else {
                    curl.right = new TreeNode(val);
                    break;
                }
            }
            else {
                if (curl.left!=null){
                    curl = curl.left;
                }
                else {
                    curl.left = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
}
