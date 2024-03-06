/*
 * @Author:chenyuxiang
 * @Date:2024/3/1
 * @LastEditTime:
 * @LastEditors: chenyuxiang
 * @Description: 给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。
 */
package easy.code_96;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */


public class Easy96 {

    //前序遍历 root left right
    //中序遍历 left root right
    //后序遍历 left right root

    public static class Solution {
        private List<Integer> list = new ArrayList<>();

        public List<Integer> inorderTraversal(TreeNode root) {
            dfs(root);
            return list;
        }

        public void dfs(TreeNode root) {
            if (root == null) {
                return;
            } else {
                dfs(root.left);
                list.add(root.val);
                dfs(root.right);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode travelList = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        System.out.println(solution.inorderTraversal(travelList));
    }
}
