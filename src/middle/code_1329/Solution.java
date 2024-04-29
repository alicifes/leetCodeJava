package middle.code_1329;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Author chenyuxiang
 * @Date 2024/4/29
 * @Description
 */
public class Solution {
    public int[][] diagonalSort(int[][] mat) {
//        for (int i = 0; i < mat.length; i++) {
//            List<Integer> curData = new ArrayList<>();
//            int j = 0;
//            while (j < mat[0].length && i + j < mat.length) {
//                curData.add(mat[i + j][j]);
//                j++;
//            }
//            curData.sort(Comparator.comparingInt(a -> a));
//            j = 0;
//            while (j < mat[0].length && i + j < mat.length) {
//                mat[i + j][j] = curData.get(j);
//                j++;
//            }
//        }
//        for (int j = 1; j < mat[0].length; j++) {
//            List<Integer> curData = new ArrayList<>();
//            int i = 0;
//            while (i < mat.length && i + j < mat[0].length) {
//                curData.add(mat[i][i + j]);
//                i++;
//            }
//            curData.sort(Comparator.comparingInt(a -> a));
//            i = 0;
//            while (i < mat.length && i + j < mat[0].length) {
//                mat[i][i + j] = curData.get(i);
//                i++;
//            }
//        }
//        return mat;
        int m = mat.length;
        int n = mat[0].length;

        // 用一个方法来处理所有对角线的排序和替换
        for (int d = 0; d < m + n - 1; d++) {
            int row = d < n ? 0 : d - n + 1;
            int col = d < n ? d : n - 1;

            List<Integer> diagonal = new ArrayList<>();
            // 收集当前对角线的所有元素
            for (int i = row, j = col; i < m && j >= 0; i++, j--) {
                diagonal.add(mat[i][j]);
            }

            // 对对角线元素排序
            diagonal.sort(Comparator.naturalOrder());

            // 将排序后的元素放回对角线
            for (int i = row, j = col, k = 0; i < m && j >= 0; i++, j--, k++) {
                mat[i][j] = diagonal.get(k);
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] mat = new int[][]{{3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}};
        int[][] result = solution.diagonalSort(mat);
        for (int[] ints : result) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
