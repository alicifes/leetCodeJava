package easy.lcp_02;

/**
 * @Author chenyuxiang
 * @Date 2024/4/18
 * @Description 分式化简
 */
public class Solution {
    int end = 0;

    public int[] fraction(int[] cont) {
        if (cont.length == 0) {
            return new int[]{0, 1};  // 如果输入为空，返回0/1
        }
        int n = cont.length;
        int[] result = new int[2]; // 分子分母初始化
        result[0] = cont[n - 1];   // 最后一个元素作为初始分子
        result[1] = 1;
        for(int index = n - 2; index >= 0; index--) {
            int temp = result[1];
            result[1] = result[0];
            result[0] = cont[index] * result[1] + temp;
        }
        int temp = result[0];
        result[0] = result[1];
        result[1] = temp;
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fraction(new int[]{3, 2, 0, 2}));
    }
}
