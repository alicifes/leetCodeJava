package easy.code_374;

/**
 * @Author chenyuxiang
 * @Date 2024/4/8
 * @Description
 */
public class Solution {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (guess(mid) == 0) {
                return mid;
            }else if (guess(mid) == 1) {
                right = mid - 1;
            }else if (guess(mid) == -1) {
                left = mid + 1;
            }
        }
        return -1;
    }

    public int guess(int num) {
        int pick = 6;
        return Integer.compare(num, pick);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.guessNumber(10));
    }
}
