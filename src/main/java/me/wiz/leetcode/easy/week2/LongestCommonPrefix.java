package me.wiz.leetcode.easy.week2;

import java.util.Objects;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

        String[] strs = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        if (Objects.isNull(strs) || strs.length == 0) {
            return "";
        }

        if (strs.length <= 200) {
            final String standard = strs[0];
            for (int i = 0; i < standard.length(); i++) {
                for (int j = 1; j < strs.length; j++) {
                    String diff = strs[j];
                    if (i >= diff.length() || standard.charAt(i) != diff.charAt(i)) {

                        return standard.substring(0, i);
                    }
                }
            }
            return standard;
        } else {
            throw new IllegalArgumentException("문자열 길이는 200을 초과할 수 없습니다.");
        }
    }
}
