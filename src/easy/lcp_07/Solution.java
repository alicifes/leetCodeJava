package easy.lcp_07;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Set;

/**
 * @Author chenyuxiang
 * @Date 2024/4/19
 * @Description
 * @param {n 玩家数量 relation 传递信息的规则 k 经过 k 轮传递到玩家 n-1 的方案数}
 */
public class Solution {
    public int numWays(int n, int[][] relation, int k) {
        // dp[t][i] 表示经过 t 轮传递到达玩家 i 的方案数
        int[][] dp = new int[k+1][n];
        // 初始条件：开始时，信息在编号0的玩家处，即小 A 处
        dp[0][0] = 1;
        // 遍历每一轮
        for (int t = 0; t < k; t++) {
            // 遍历每个玩家
            for (int i = 0; i < n; i++) {
                // 如果当前轮次当前玩家有方案数，则尝试传递信息
                if (dp[t][i] > 0) {
                    // 查看所有的传递关系
                    for (int[] rel : relation) {
                        if (rel[0] == i) {
                            // rel[0] 到 rel[1] 是传递关系，更新下一轮 rel[1] 的方案数
                            dp[t+1][rel[1]] += dp[t][i];
                        }
                    }
                }
            }
        }
        // 经过 k 轮后，信息应该到达编号 n-1 的玩家，返回方案数
        return dp[k][n-1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numWays(5, new int[][]{{0, 2}, {2, 1}, {3, 4}, {2, 3}, {1, 4}, {2, 0}, {0, 4}}, 3));
    }
}
