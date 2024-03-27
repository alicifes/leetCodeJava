/**
 * @Author:chenyuxiang
 * @Date:2024/3/27
 * @LastEditTime:
 * @LastEditors: chenyuxiang
 * @Description: 给定一个二叉树，判断它是否是平衡二叉树
 */
package easy.code_110;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(getNodeDep(root.left) - getNodeDep(root.right)) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int getNodeDep(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getNodeDep(root.left), getNodeDep(root.right)) + 1;
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
        System.out.println(solution.isBalanced(root));
    }
}
