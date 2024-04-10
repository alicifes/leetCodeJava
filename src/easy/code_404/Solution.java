package easy.code_404;
/**
 * @Author:chenyuxiang
 * @Date:2024/3/29
 * @LastEditTime:
 * @LastEditors: chenyuxiang
 * @Description: 给定二叉树的根节点 root ，返回所有左叶子之和。
 */


public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        return sumLeft(root, 0);
    }
    public int sumLeft(TreeNode node, int end){
        if(node == null){
            return end;
        }
        if(node.left != null && node.left.left == null && node.left.right == null){
            return end + node.left.val + sumLeft(node.right, end);
        }
        return sumLeft(node.left, end) + sumLeft(node.right, end);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(solution.sumOfLeftLeaves(root));
    }
}
