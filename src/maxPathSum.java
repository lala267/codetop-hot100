public class maxPathSum {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }
    static int max = Integer.MIN_VALUE;
    public static int maxPathSum(TreeNode root) {
        if (root == null) return 0;
        dfs(root);
        return max;
    }
    public static int dfs(TreeNode root) {
        if (root == null) return 0;
        int left = Math.max(0, maxPathSum(root.left));
        int right  = Math.max(0, maxPathSum(root.right));
        int curr = left + right + root.val;
        max = Math.max(curr, max);
        return Math.max(left, right) + root.val;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        maxPathSum(root);
        System.out.print(max);
    }
}
