package middle.code_75;

/**
 * @Author chenyuxiang
 * @Date 2024/4/16
 * @Description 给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地对它们进行排序，
 * 使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * 必须在不使用库内置的 sort 函数的情况下解决这个问题。
 */
public class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int p0 = 0, p2 = n - 1;
        for(int i = 0; i < p2; i ++){
            while (nums[i] == 2 && i < p2){
                int temp = nums[i];
                nums[i] = nums[p2];
                nums[p2] = temp;
                p2 --;
            }
            //交换0
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[p0];
                nums[p0] = temp;
                p0 ++;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.sortColors(new int[]{2, 0, 2, 1, 1, 0});
    }
}
