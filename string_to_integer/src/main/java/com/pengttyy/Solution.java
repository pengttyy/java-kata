package com.pengttyy;

public class Solution {
    public int myAtoi(String str) {
        char[] chars = str.toCharArray();
        int res = 0;
        for (char aChar : chars) {
            int ascii = (int) aChar;
            if (ascii >= 48 && ascii <= 57) {
                res = getRes(res, ascii, 48);
            } else if (ascii == 45) {
                res = getRes(res, ascii, 46);
            }
        }
        return res;
    }

    private int getRes(int res, int ascii, int offset) {
        return res * 10 + (ascii - offset);
    }
}
