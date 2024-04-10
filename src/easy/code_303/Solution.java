package easy.code_303;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author chenyuxiang
 * @Date 2024/4/2
 * @Description
 */
public class Solution {
    class NumArray {
        private List<Integer> list = new ArrayList<>();

        public NumArray(int[] nums) {
            for (int item : nums) {
                list.add(item);
            }
        }

        public int sumRange(int left, int right) {
            int sum = 0;
            for(int i = left; i <= right; i++) {
                sum += list.get(i);
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        NumArray numArray = solution.new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));
        System.out.println(numArray.sumRange(0, 5));
    }
}
