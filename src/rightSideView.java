import java.util.ArrayList;
import java.util.List;

public class rightSideView {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }
    static int depth = 0;
    static List<Integer> res = new ArrayList<>();
    public static List<Integer> rightSideView(TreeNode root) {
        if(root == null) return null;
        dfs(root, depth, res);
        return res;
    }
    public static void dfs(TreeNode root, int depth, List<Integer> res) {
        if(root == null) return;
        if(res.size() == depth){
            res.add(root.val);
        }
        dfs(root.right, depth+1, res);
        dfs(root.left, depth+1, res);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(rightSideView(root));
    }
}
