package easy.code_112;

public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        return getPath(root,0, targetSum);
    }

    public boolean getPath(TreeNode root, int num, int targetSum) {
        if (root == null) {
            //不参与计算
            return false;
        }
        if(root.left == null && root.right == null) {
            return num + root.val == targetSum;
        }
        num += root.val;
        return getPath(root.right, num, targetSum) || getPath(root.left, num, targetSum);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(3);
        System.out.println(solution.hasPathSum(root, 7));
    }
}
