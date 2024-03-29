package easy.code_2129;

/**
 * @Author:chenyuxiang
 * @Date:2024/3/11
 * @LastEditTime:
 * @LastEditors: chenyuxiang
 * @Description:
 */


class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().capitalizeTitle("the quick brown is fox"));
    }

    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length()<= 2) {
                words[i] = words[i].toLowerCase();
            } else {
                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
            }
        }
        return String.join(" ", words);
    }
}