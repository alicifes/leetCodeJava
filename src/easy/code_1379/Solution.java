package easy.code_1379;

/**
 * @Author chenyuxiang
 * @Date 2024/4/3
 * @Description
 */
public class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return getTargetNode(cloned, target);
    }

    public TreeNode getTargetNode(TreeNode node, TreeNode target) {
        if (node == null) {
            return null;
        }
        if (node.val == target.val && compareNode(node, target)) {
            return node;
        }
        //前序遍历
        TreeNode left = getTargetNode(node.left, target);
        if (left != null) {
            return left;
        }
        TreeNode right = getTargetNode(node.right, target);
        if (right != null) {
            return right;
        }
        return null;
    }

    public Boolean compareNode(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        if (node1.val != node2.val) {
            return false;
        }
        return compareNode(node1.left, node2.left) && compareNode(node1.right, node2.right);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode original = new TreeNode(7);
        original.left = new TreeNode(4);
        original.right = new TreeNode(3);
        original.left.left = new TreeNode(1);
        original.left.right = new TreeNode(2);
        original.right.left = new TreeNode(6);
        original.right.right = new TreeNode(19);
        TreeNode cloned = new TreeNode(7);
        cloned.left = new TreeNode(4);
        cloned.right = new TreeNode(3);
        cloned.left.left = new TreeNode(1);
        cloned.left.right = new TreeNode(2);
        cloned.right.left = new TreeNode(6);
        cloned.right.right = new TreeNode(19);
        TreeNode target = new TreeNode(3);
        System.out.println(solution.getTargetCopy(original, cloned, target));
    }
}
