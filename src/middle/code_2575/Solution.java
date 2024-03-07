package middle.code_2575;

import java.util.Arrays;

class Solution {
    public static int[] divisibilityArray(String word, int m) {
        int n = word.length();
        int[] res = new int[n];
        long cur = 0;
        for (int i = 0; i < n; i++) {
            res[i] = (cur = (cur * 10 + (word.charAt(i) - '0')) % m) == 0 ? 1 : 0;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(divisibilityArray("1234567890", 10)));
    }
}
