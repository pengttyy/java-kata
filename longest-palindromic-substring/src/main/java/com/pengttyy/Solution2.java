package com.pengttyy;

public class Solution2 {
    char[] chars;
    private int globalLow, maxLen, len;

    public static void main(String[] args) {
        String str = "ABCCBA";
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.longestPalindrome(str));
    }

    public String longestPalindrome(String s) {
        len = s.length();
        chars = s.toCharArray();
        if (len < 2)
            return s;

        for (int i = 0; i < len - 1; i++) {
            i = extendPalindrome(i);
        }
        return s.substring(globalLow, globalLow + maxLen);
    }

    private int extendPalindrome(int i) {
        int j = i; //Low Index
        int k = i; //High Index
        while (k < len - 1 && chars[k] == chars[k + 1]) //Extend forward, looking for same character
        {
            k++;
        }
        //Since i to k are all the same characters
        //Next iteration of the main loop can start from k
        int next = k;
        while (j >= 0 && k < len && chars[j] == chars[k]) //Extend both forward and backward
        {
            j--;
            k++;
        }

        if (maxLen < k - j - 1) {
            globalLow = j + 1;
            maxLen = k - j - 1;
        }

        return next;
    }
}
