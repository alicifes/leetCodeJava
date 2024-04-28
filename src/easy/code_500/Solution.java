package easy.code_500;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author chenyuxiang
 * @Date 2024/4/23
 * @Description
 */
public class Solution {
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        list.add("qwertyuiop");
        list.add("asdfghjkl");
        list.add("zxcvbnm");
        List<String> result = new ArrayList<>();
        for (String str : words) {
            for (String s : list) {
                if (isOneRow(str.toLowerCase(), s)) {
                    result.add(str);
                    break;
                }
            }
        }
        return result.toArray(new String[result.size()]);
    }

    public Boolean isOneRow(String str, String s) {
        for (int i = 0; i < str.length(); i++) {
            if (s.indexOf(str.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"}));
    }
}
