package middle.code_2007;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author chenyuxiang
 * @Date 2024/4/18
 * @Description
 */
public class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if (n % 2 != 0) {
            return new int[0];
        }
        Arrays.sort(changed); // 排序数组
        HashMap<Integer, Integer> countMap = new HashMap<>(); // 创建哈希表存储每个数字的出现次数
        for (int num : changed) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        int[] original = new int[n / 2];
        int index = 0;

        for (int num : changed) {
            if (countMap.get(num) == 0) continue; // 如果当前数字已经处理完毕，则跳过
            int doubleNum = num * 2;
            if (!countMap.containsKey(doubleNum) || countMap.get(doubleNum) <= 0) {
                return new int[0]; // 如果两倍数不存在或者已经用完，返回空数组
            }
            original[index++] = num; // 添加到结果数组
            countMap.put(num, countMap.get(num) - 1); // 更新哈希表中当前数字和两倍数字的计数
            countMap.put(doubleNum, countMap.get(doubleNum) - 1);
        }
        return original;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.findOriginalArray(new int[]{1, 3, 4, 2, 6, 8})));
        System.out.println(Arrays.toString(solution.findOriginalArray(new int[]{0, 0, 0, 0})));
        System.out.println(Arrays.toString(solution.findOriginalArray(new int[]{0, 0, 1, 0})));
    }
}
