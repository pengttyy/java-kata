package com.pengttyy;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String str) {
        byte[] bytes = str.getBytes();
        int maxLen = 0;
        Set<Byte> tempSet = new HashSet<>();
        for (int i = 0; i < bytes.length; i++) {
            for (int z = i; z < bytes.length; z++) {
                if (tempSet.contains(bytes[z])) {
                    maxLen = Math.max(maxLen, tempSet.size());
                    tempSet.clear();
                    break;
                } else if (z == bytes.length - 1) {
                    maxLen = Math.max(maxLen, tempSet.size() + 1);
                    tempSet.clear();
                } else {
                    tempSet.add(bytes[z]);
                }
            }
        }
        return maxLen;
    }
}
