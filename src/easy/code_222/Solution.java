package easy.code_222;

/**
 * @Author:chenyuxiang
 * @Date:2024/3/26
 * @LastEditTime:
 * @LastEditors: chenyuxiang
 * @Description:
 */

public class Solution {
    public int countNodes(TreeNode root) {
        return getCount(root, 0);
    }

    public int getCount(TreeNode root, int end) {
        if (root == null) {
            return end;
        }
        end++;
        end = getCount(root.left, end);
        end = getCount(root.right, end);
        return end;
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
        System.out.println(solution.countNodes(root));
    }
}
