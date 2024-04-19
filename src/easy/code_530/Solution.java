package easy.code_530;

/**
 * @Author chenyuxiang
 * @Date 2024/4/11
 * @Description
 */
public class Solution {
    public int getMinimumDifference(TreeNode root) {
        int minLeft = Integer.MAX_VALUE;
        int minRight = Integer.MAX_VALUE;
        if (root.left != null) {
            minLeft = Math.abs(root.val - root.left.val);
            minLeft = dfs(root.left, minLeft);
        }
        if (root.right != null) {
            minRight = Math.abs(root.val - root.right.val);
            minRight = dfs(root.right, minRight);
        }
        return Math.min(minLeft, minRight);
    }

    private int dfs(TreeNode root, int min) {
        if (root == null) {
            return min;
        }
        if (root.left != null) {
            min = Math.min(min, Math.abs(root.val - root.left.val));
            dfs(root.left, min);
        }
        if (root.right != null) {
            min = Math.min(min, Math.abs(root.val - root.right.val));
            dfs(root.right, min);
        }
        return min;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(7);
        System.out.println(solution.getMinimumDifference(root));
    }
}
