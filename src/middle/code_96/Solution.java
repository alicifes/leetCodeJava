package middle.code_96;

/**
 * @Author chenyuxiang
 * @Date 2024/4/7
 * @Description: 给你一个整数 n ，求恰由 n 个节点组成且节点值从 1 到 n 互不相同的 二叉搜索树 有多少种？
 * 返回满足题意的二叉搜索树的种数。
 * @Description: 二叉搜索树的性质：左子树的所有节点都小于根节点，右子树的所有节点都大于根节点 BST
 */
public class Solution {
    public int numTrees(int n) {
        if (n <= 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        return dp[n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numTrees(3));
    }
}
