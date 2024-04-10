package easy.code_461;

/**
 * @Author chenyuxiang
 * @Date 2024/4/2
 * @Description 两个整数之间的 汉明距离 指的是这两个数字对应二进制位不同的位置的数目。
 * 给你两个整数 x 和 y，计算并返回它们之间的汉明距离。
 */
public class Solution {
    public int hammingDistance(int x, int y) {
//        int res = x ^ y;
//        String binaryString = Integer.toBinaryString(res);
//        int count = 0;
//        for (int i = 0; i < binaryString.length(); i++) {
//            if (binaryString.charAt(i) == '1') {
//                count++;
//            }
//        }
//        return count;
        //优化写法
        int z = x ^ y;
        int ans = 0;
        while (z != 0) {
            ans += z & 1;
            z >>= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hammingDistance(1, 4));
    }
}
