package easy.code_2529;

/**
 * @Author chenyuxiang
 * @Date 2024/4/9
 * @Description
 */
public class Solution {
    public int maximumCount(int[] nums) {
        if(nums[0] > 0) {
            return nums.length;
        }
        if(nums[nums.length - 1] < 0) {
            return nums.length;
        }
        int positiveCount = 0;
        int negativeCount = 0;
        for(int num : nums) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }
        return Math.max(positiveCount, negativeCount);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maximumCount(new int[]{1, 2, 3, 4, 5}));
    }
}
