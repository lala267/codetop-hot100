import java.util.ArrayList;
import java.util.List;

public class inorderTraversal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }
    static List<Integer> res = new ArrayList<>();
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        inorderTraversal(root);
        System.out.println(res);
    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return res;
        dfs(root, res);
        return res;
    }
    private static void dfs(TreeNode root, List<Integer> res) {
        if(root == null) return;
        dfs(root.left, res);
        res.add(root.val);
        dfs(root.right, res);
    }
}
