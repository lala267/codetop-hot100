import java.util.*;

public class kthSmallest {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static List<Integer> res = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        int k = 3;

        dfs(root);

        System.out.println(res.get(k - 1));
    }

    public static void dfs(TreeNode root) {
        if (root == null) return;

        dfs(root.left);
        res.add(root.val);
        dfs(root.right);
    }
}