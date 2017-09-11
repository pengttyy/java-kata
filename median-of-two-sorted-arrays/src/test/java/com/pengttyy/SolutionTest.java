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
    public void findMedianSortedArrays_1() throws Exception {
        int[] num1 = new int[]{1};
        int[] num2 = new int[]{1};
        double result = this.solution.findMedianSortedArrays(num1, num2);
        System.out.println(result);
        assertEquals(1.0, result, 0);
    }

    @Test
    public void findMedianSortedArrays_2() throws Exception {
        int[] num1 = new int[]{1, 2};
        int[] num2 = new int[]{1, 2};
        double result = this.solution.findMedianSortedArrays(num1, num2);
        assertEquals(1.5, result, 0);
    }
}
