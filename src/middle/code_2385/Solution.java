package middle.code_2385;

/**
 * @Author chenyuxiang
 * @Date 2024/4/24
 * @Description
 */
public class Solution {
    int ans = 0;    // 最短用时
    int depth = -1; // 起始节点的高度

    public int amountOfTime(TreeNode root, int start) {
        dfs(root, 0, start);
        return ans;
    }

    int dfs(TreeNode root, int level, int start) {
        if (root == null) return 0;
        // 当前节点即起始节点
        if (root.val == start) depth = level;
        // 左子树的树高
        int l = dfs(root.left, level + 1, start);
        // 起始节点是否在左子树上
        boolean inLeft = depth != -1;
        // 右子树的树高
        int r = dfs(root.right, level + 1, start);
        if (root.val == start) {
            // 情况1：感染以 start 为根结点的树所需时间
            ans = Math.max(ans, Math.max(l, r));
        }
        if (inLeft) {
            ans = Math.max(ans, depth - level + r);
        } else {
            // 情况2：感染以 root 为根结点的树所需时间
            ans = Math.max(ans, depth - level + l);
        }
        // 返回树高
        return Math.max(l, r) + 1;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);
        Solution solution = new Solution();
        System.out.println(solution.amountOfTime(root, 3));
    }
}
