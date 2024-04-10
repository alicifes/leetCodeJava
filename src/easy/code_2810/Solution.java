package easy.code_2810;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author chenyuxiang
 * @Date 2024/4/1
 * @Description
 */
public class Solution {
    public String finalString(String s) {
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) == 'i'){
                Collections.reverse(list);
            } else {
                list.add(s.charAt(i));
            }
        }
        StringBuilder res = new StringBuilder();
        for (Character character : list) {
            res.append(character);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.finalString("asdasdasidsadas"));
    }
}
