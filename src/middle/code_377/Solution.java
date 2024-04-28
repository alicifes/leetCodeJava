package middle.code_377;

import java.util.Arrays;

/**
 * @Author chenyuxiang
 * @Date 2024/4/22
 * @Description
 */
public class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for(int i = 1; i < target + 1; i ++){
            for(int num : nums){
                if(i >= num){
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combinationSum4(new int[]{1, 2, 3}, 4));
    }
}
