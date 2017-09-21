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

    /**
     * 大于等于零
     *
     * @throws Exception
     */
    @Test
    public void reverse_1() throws Exception {
        int result = this.solution.reverse(123);
        assertEquals(321, result);
    }

    /**
     * 小于零
     *
     * @throws Exception
     */
    @Test
    public void reverse_2() throws Exception {
        int result = this.solution.reverse(-123);
        assertEquals(-321, result);
    }

    /**
     * 溢出
     *
     * @throws Exception
     */
    @Test
    public void reverse_3() throws Exception {
        int result = this.solution.reverse(1534236469);
        assertEquals(0, result);
    }
}
