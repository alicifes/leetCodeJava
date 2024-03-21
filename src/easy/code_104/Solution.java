package easy.code_104;

public class Solution {
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if(root == null) {
            return depth;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        System.out.println(solution.maxDepth(root));
    }
}
