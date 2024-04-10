/**
 * @Author:chenyuxiang
 * @Date:2024/3/29
 * @LastEditTime:
 * @LastEditors: chenyuxiang
 * @Description: 给你一个下标从 0 开始的整数数组 nums 。
 * 如果下标三元组 (i, j, k) 满足下述全部条件，则认为它是一个 山形三元组 ：
 * i < j < k
 * nums[i] < nums[j] 且 nums[k] < nums[j]
 * 请你找出 nums 中 元素和最小 的山形三元组，并返回其 元素和 。如果不存在满足条件的三元组，返回 -1 。
 */
package easy.code_2908;


public class Solution {
    public int minimumSum(int[] nums) {
        if (nums.length < 3) {
            return -1;
        }
        if (nums.length == 3 && nums[0] < nums[1] && nums[1] < nums[2]) {
            return nums[0] + nums[1] + nums[2];
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] < nums[j] && nums[k] < nums[j]) {
                        res = Math.min(res, nums[i] + nums[j] + nums[k]);
                    }
                }
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 4, 2, 3};
        System.out.println(solution.minimumSum(nums));
    }
}
