package com.pengttyy;

import java.util.Arrays;

public class Solution {
    public String longestPalindrome(String str) {
        char[] chars = str.toCharArray();
        int len = chars.length;
        int parity = len % 2;

        String tempSubPalindromic = "";
        if (parity == 1) {
            int centerIndex = len / 2;
            for (int index = centerIndex + 1; index < len; index++) {
                int before = centerIndex - (index - centerIndex);

                System.out.println("before:" + before + "==" + index);
                tempSubPalindromic = getString(chars, tempSubPalindromic, before);
                if (2 * before + 1 == tempSubPalindromic.length()) {
                    return tempSubPalindromic;
                }


                tempSubPalindromic = getString(chars, tempSubPalindromic, index);
            }
        }

        return tempSubPalindromic;
    }

    private String getString(char[] chars, String tempSubPalindromic, int before) {
        String subPalindromic = getSubPalindromic(chars, before);
        if (subPalindromic.length() > tempSubPalindromic.length()) {
            tempSubPalindromic = subPalindromic;
        }
        return tempSubPalindromic;
    }

    private String getSubPalindromic(char[] chars, int point) {
        int begin = point;
        int end = point;
        while (begin >= 0 && end < chars.length && chars[begin] == chars[end]) {
            begin--;
            end++;
        }
        int from = begin + 1;
        if (from - end == 1) {
            return "";
        }
        return new String(Arrays.copyOfRange(chars, from, end));
    }


    public String longestPalindrome2(String s) {
        if (s.isEmpty()) {
            return null;
        }
        if (s.length() == 1) {
            return s;
        }
        String longest = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            // get longest palindrome with center of i
            String tmp = helper(s, i, i);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }

            // get longest palindrome with center of i, i+1
            tmp = helper(s, i, i + 1);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }
        }
        return longest;
    }

    public String helper(String s, int begin, int end) {
        while (begin >= 0 && end <= s.length() - 1
                && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }
        String subS = s.substring(begin + 1, end);
        return subS;
    }
}
