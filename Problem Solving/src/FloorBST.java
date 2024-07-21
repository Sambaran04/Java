public class FloorBST {
    public static void main(String[] args) {

    }
    public static int floor(TreeNode root, int x) {
        if(root==null){
            return -1;
        }
        int floor=-1;
        while(root!=null){
            if(x==root.val){
                floor = root.val;
                return floor;
            }
            if(root.val>x){
                root = root.left;
            }
            else{
                floor = root.val;
                root = root.right;
            }
        }
        return floor;
    }
}
