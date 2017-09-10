package com.pengttyy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void lengthOfLongestSubstring() throws Exception {
        Solution solution = new Solution();
        String str = "dvdf";
        int maxLen = solution.lengthOfLongestSubstring(str);
        assertEquals(2, maxLen);
    }
}
