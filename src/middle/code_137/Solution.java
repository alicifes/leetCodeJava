package middle.code_137;

import java.util.HashMap;

/**
 * @Author:chenyuxiang
 * @Date:2024/3/11
 * @LastEditTime:
 * @LastEditors: chenyuxiang
 * @Description: 给你一个整数数组 nums ，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次 。请你找出并返回那个只出现了一次的元素。
 * 你必须设计并实现线性时间复杂度的算法且使用常数级空间来解决此问题。
 */

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 2, 3, 2};
        System.out.println(solution.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(nums[i])) {
//                map.put(nums[i], map.get(nums[i]) + 1);
//            } else {
//                map.put(nums[i], 1);
//            }
//        }
//        for (int i : map.keySet()) {
//            if (map.get(nums[i]) == 1) {
//                return nums[i];
//            }
//        }
//        return -1;
        int[] counts = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                counts[i] += num & 1; //取出最低位
                num >>>= 1; //无符号右移
            }
        }
        int res = 0;
        for (int i = 31; i >= 0; i--) {
            res <<= 1; //左移一位
            res |= counts[i] % 3;
        }
        return res;
    }
}
