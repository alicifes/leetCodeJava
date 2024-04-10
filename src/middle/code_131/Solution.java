package middle.code_131;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author chenyuxiang
 * @Date 2024/4/3
 * @Description
 */
public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList();
        List<String> path = new ArrayList();
        dfs(s, 0, path, res);
        return res;
    }

    public void dfs(String s, int start, List<String> path, List<List<String>> res) {
        if (start == s.length()) {
            res.add(new ArrayList(path));
        } else {
            for (int i = start + 1; i <= s.length(); i++) {
                if (isPail(s.substring(start, i))) {
                    path.add(s.substring(start, i));
                    dfs(s, i, path, res);
                    path.remove(path.size() - 1);
                }
            }
        }
    }

    public Boolean isPail(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.partition("aab"));
    }
}
