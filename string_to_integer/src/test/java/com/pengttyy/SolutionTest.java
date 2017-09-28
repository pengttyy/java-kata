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
    public void atoi_ok() throws Exception {
        String str = "456";
        int result = this.solution.myAtoi(str);
        assertEquals(456, result);
    }

    @Test
    public void atoi_ok2() throws Exception {
        String str = "-1";
        int result = this.solution.myAtoi(str);
        assertEquals(-1, result);
    }


}
