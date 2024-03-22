package easy.code_144;

import java.util.ArrayList;
import java.util.List;
//返回前序遍历
class Solution {


    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root != null) {
            if (root.left != null) {
                preorder(root.left, result);
            }
            if (root.right != null) {
                preorder(root.right, result);
            }
            result.add(root.val);
        }
        return result;
    }
    public void preorder(TreeNode root, List<Integer> result) {
        if(root == null) {
            return;
        }
        if(root.left != null) {
            preorder(root.left, result);
        }
        if(root.right != null) {
            preorder(root.right, result);
        }
        result.add(root.val);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> result = solution.preorderTraversal(root);
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }
}
