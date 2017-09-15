package com.pengttyy;

import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int[] all = new int[num1.length + num2.length];
        System.arraycopy(num1, 0, all, 0, num1.length);
        System.arraycopy(num2, 0, all, num1.length, num2.length);
        Arrays.sort(all);
        int i = all.length / 2;
        if (all.length % 2 == 0) {
            return (all[i]+all[i-1])/2.0;
        } else {
            return all[i];
        }
    }
}
