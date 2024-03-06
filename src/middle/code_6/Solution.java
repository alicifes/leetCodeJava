package middle.code_6;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:chenyuxiang
 * @Date:2024/3/5
 * @LastEditTime:
 * @LastEditors: chenyuxiang
 * @Description: 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右
 * 进行 Z 字形排列。
 * 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
 * 请你实现这个将字符串进行指定行数变换的函数：
 */

public class Solution {
    public String convert(String s, int numRows) {
        List<Integer[]> end = new ArrayList<>(numRows);
        for(int i = 0; i < s.length(); i++){
            int row = i % (2 * numRows - 2);
            if(row < numRows){
                if(end.size() == 0 || end.get(row)[0] == 0){
                    end.add(new Integer[]{1, i});
                }else{
                    end.set(row, new Integer[]{end.get(row)[0] + 1, i});
                }
            }else{
                int index = 2 * numRows - 2 - row;
                if(end.size() == 0 || end.get(index)[0] == 0){
                    end.add(new Integer[]{1, i});
                }else{
                    end.set(index, new Integer[]{end.get(index)[0] + 1, i});
                }
            }
        }
        return end.stream().map(e -> s.substring(e[1], e[1] + e[0])).reduce("", (a, b) -> a + b);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String result = solution.convert(s, numRows);
        System.out.println(result);
    }
}
