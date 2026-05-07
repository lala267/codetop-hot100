public class invertTree {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){ this.val = val; }
    }
    public static TreeNode invertTree(TreeNode root){
        if(root == null) return root;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        invertTree(root);
        print(root);
    }
    public static void print(TreeNode root){
        if(root == null) return;
        System.out.print(root.val + " ");
        print(root.left);
        print(root.right);
    }
}
