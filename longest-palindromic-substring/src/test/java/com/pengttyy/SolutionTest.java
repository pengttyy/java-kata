package com.pengttyy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() throws Exception {
        this.solution = new Solution();
    }

    @Test
    public void longestPalindrome() throws Exception {
        String str = "bbbbb";
        String result = this.solution.longestPalindrome2(str);
        assertEquals("bab", result);
    }

    @Test
    public void longestPalindrome_1() throws Exception {
        String str = "cbbd";
        String result = this.solution.longestPalindrome(str);
        assertEquals("bb", result);
    }
}
