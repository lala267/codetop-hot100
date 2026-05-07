public class isSymmetric {
    static class  TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }
    public static boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        TreeNode p1 = root.left, p2 = root.right;
        return isMirror(p1, p2);
    }
    private static boolean isMirror(TreeNode p1, TreeNode p2){
        if(p1 == null && p2 == null) return true;
        if(p1 == null || p2 == null) return false;
        if(p1.val != p2.val) return false;
        return isMirror(p1.left, p2.right) && isMirror(p1.right, p2.left);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.print(isSymmetric(root));
    }
}
