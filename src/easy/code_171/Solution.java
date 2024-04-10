package easy.code_171;

/**
 * @Author chenyuxiang
 * @Date 2024/4/9
 * @Description 给你一个字符串 columnTitle ，表示 Excel 表格中的列名称。返回 该列名称对应的列序号 。
 */
public class Solution {
    public int titleToNumber(String columnTitle) {
        int end = 0;
        for(int i = 0 ; i < columnTitle.length();i++) {
            end = end * 26 + columnTitle.charAt(i) - 'A' + 1;
        }
        return end;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.titleToNumber("AB"));
    }
}
