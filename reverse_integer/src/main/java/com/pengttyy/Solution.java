package com.pengttyy;

public class Solution {

    public int reverse(int i) {
        if (i < 0) {
            return -getAnInt(-i);
        }
        return getAnInt(i);
    }

    private int getAnInt(int i) {
        try {
            return Integer.parseInt(new StringBuilder().append(i).reverse().toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public int reverse2(int x) {
        long res = 0;
        while (x != 0) {
            int b = x % 10;
            x = x / 10;
            res = res * 10 + b;
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) res;
    }

}
