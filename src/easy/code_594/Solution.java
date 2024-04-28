package easy.code_594;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author chenyuxiang
 * @Date 2024/4/28
 * @Description
 */
public class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                int currentLen = map.get(key) + map.get(key + 1);
                maxLen = Math.max(maxLen, currentLen);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findLHS(new int[]{1, 3, 2, 2, 5, 2, 3, 7}));
    }
}
