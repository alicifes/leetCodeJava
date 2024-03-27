package easy.code_108;


public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return getBST(nums, 0, nums.length - 1);
    }

    public TreeNode getBST(int[] arr, int left, int right) {
        if (left > right) {
            return null;
        }
        int middle = left + (right - left) / 2;  // 防止整型溢出
        TreeNode newNode = new TreeNode(arr[middle]);
        newNode.left = getBST(arr, left, middle - 1);
        newNode.right = getBST(arr, middle + 1, right);
        return newNode;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode root = solution.sortedArrayToBST(nums);
        System.out.println(root.val);
    }
}
