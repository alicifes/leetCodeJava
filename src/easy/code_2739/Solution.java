package easy.code_2739;

/**
 * @Author chenyuxiang
 * @Date 2024/4/25
 * @Description
 */
public class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int end = 0;
        while (mainTank >= 5){
            mainTank -= 5;
            end += 50;
            if(additionalTank > 0){
                mainTank += 1;
                additionalTank --;
            }
        }
        end += mainTank * 10;
        return end;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.distanceTraveled(5, 10));
    }
}
