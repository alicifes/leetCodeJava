package middle.code_64;

/**
 * @Author:chenyuxiang
 * @Date:2024/3/18
 * @LastEditTime:
 * @LastEditors: chenyuxiang
 * @Description:
 */

public class Solution {
    public int minPathSum(int[][] grid) {
        int right = grid[0].length;
        int down = grid.length;
        int[][] dp = new int[down][right];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < right; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < down; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < down; i++) {
            for (int j = 1; j < right; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[down - 1][right - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(solution.minPathSum(grid));
    }
}
