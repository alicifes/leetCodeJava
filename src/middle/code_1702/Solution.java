package middle.code_1702;

/**
 * @Author chenyuxiang
 * @Date 2024/4/10
 * @Description
 */
public class Solution {
    public String maximumBinaryString(String binary) {
        // 统计字符串中 '0' 的数量和第一个 '0' 的位置
        int zeroCount = 0;
        int firstZeroIndex = -1;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                zeroCount++;
                if (firstZeroIndex == -1) {
                    firstZeroIndex = i;
                }
            }
        }

        // 如果没有 '0' 或只有一个 '0'，则字符串已经是最优的
        if (zeroCount <= 1) {
            return binary;
        }

        // 构造最终字符串
        StringBuilder sb = new StringBuilder();
        // 第一个 '0' 之前全部填充 '1'
        for (int i = 0; i < firstZeroIndex; i++) {
            sb.append('1');
        }
        // 只保留一个 '0'，其余的位置都填充 '1'
        // 总 '0' 的数量减去 1（因为我们需要留一个 '0'），这个 '0' 将被放在最后一个 '0' 的位置
        for (int i = 0; i < zeroCount - 1; i++) {
            sb.append('1');
        }
        // 添加剩下的那个 '0'
        sb.append('0');
        while (sb.length() < binary.length()) {
            sb.append('1');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maximumBinaryString("1100"));
        System.out.println(solution.maximumBinaryString("000110"));
    }
}
