package middle.code_59;

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int num = 1;
        while(left <= right && top <= bottom) {
            for(int i = left ; i <= right  ; i ++){
                res[top][i] = num++;
            }
            for(int i = top + 1 ; i <= bottom ; i ++){
                res[i][right] = num++;
            }
            if(left < right && top < bottom) {
                for(int i = right - 1 ; i > left ; i --){
                    res[bottom][i] = num++;
                }
                for(int i = bottom ; i > top ; i --){
                    res[i][left] = num++;
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] res = solution.generateMatrix(3);
        for(int i = 0 ; i < res.length ; i ++){
            for(int j = 0 ; j < res[i].length ; j ++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}

