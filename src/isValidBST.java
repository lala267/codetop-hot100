public class isValidBST {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){this.val = val;}
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(7);
        System.out.print(isValidBST(root));
    }
    public static boolean isValidBST(TreeNode root){
        if(root==null)return true;
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public static boolean dfs(TreeNode root, long min, long max){
        if(root==null)return true;
        if(root.val<min || root.val>max)return false;
        return dfs(root.left, min, root.val) && dfs(root.right, root.val, max);
    }
}
