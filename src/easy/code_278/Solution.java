package easy.code_278;

/**
 * @Author chenyuxiang
 * @Date 2024/4/9
 * @Description
 */
public class Solution {
    public int firstBadVersion(int n) {
        if(!isBadVersion(n)){
            return n;
        }
        if(isBadVersion(1)){
            return 1;
        }
        int left = 1;
        int right = n;
        while (left < right){
            int mid = left + (right - left) / 2;
            if(isBadVersion(mid)){
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }

    boolean isBadVersion(int version) {
        int badVersion = 3;
        return version >= badVersion;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstBadVersion(5));
    }
}
