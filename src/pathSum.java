public class pathSum {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.print(pathSum(root, 4));
    }
    static int res = 0;
    public static int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        dfs(root, targetSum);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return targetSum;
    }
    public static void dfs(TreeNode root, int targetSum) {
        if(root == null) return;
        if(root.val == targetSum) res++;
        dfs(root.left, targetSum - root.val);
        dfs(root.right, targetSum - root.val);
    }
}
