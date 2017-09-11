package com.pengttyy;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String str) {
        byte[] bytes = str.getBytes();
        int maxLen = 0;
        for (int i = 0; i < bytes.length; i++) {
            Set<Byte> tempSet = new HashSet<>();
            for (int z = i; z < bytes.length; z++) {
                if (tempSet.contains(bytes[z])) {
                    break;
                }
                tempSet.add(bytes[z]);
            }

            if (bytes.length - i == tempSet.size()) {
                return Math.max(maxLen, tempSet.size());
            }

            maxLen = Math.max(maxLen, tempSet.size());
        }
        return maxLen;
    }

    public int lengthOfLongestSubstring_fast(String s) {
        if (s.length() == 0) return 0;
        // for ASCII char sequence, use this as a hashmap
        int[] idx = new int[160];
        //initaize arr to -1 inorder to correct calculate interval
        for (int i = 32; i < idx.length; i++) {
            idx[i] = -1;
        }
        int max = 0, m = 0;
        for (int i = 0; i < s.length(); i++) {
            int ascii = (int) (s.charAt(i));
            m = Math.max(idx[ascii] + 1, m);
            idx[ascii] = i;
            max = Math.max(max, i - m + 1);
        }
        return max;
    }
}
