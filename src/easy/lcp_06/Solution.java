package easy.lcp_06;

/**
 * @Author chenyuxiang
 * @Date 2024/4/19
 * @Description
 */
public class Solution {
    public int minCount(int[] coins) {
        int end = 0;
        for (int item : coins) {
            if (item % 2 == 0) {
                end += item / 2;
            } else {
                end += (item + 1) / 2;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minCount(new int[]{4, 2, 1}));
    }
}
