package com.pengttyy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String str) {
        List<Set<Character>> list = new ArrayList<>();

        Set<Character> currentChars = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (currentChars.contains(c)) {
                list.add(currentChars);
                currentChars = new HashSet<>();
            }
            currentChars.add(c);
        }
        list.add(currentChars);

        int max = 0;
        for (Set<Character> characters : list) {
            max = Math.max(max, characters.size());
        }
        return max;
    }
}
