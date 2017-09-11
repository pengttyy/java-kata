package com.pengttyy;

import org.junit.Before;
import org.junit.Test;

import static com.pengttyy.Solution.ListNode;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() throws Exception {
        this.solution = new Solution();
    }

    @Test
    public void addTwoNumbers_1() throws Exception {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = this.solution.addTwoNumbers(l1, l2);
        assertEquals(2, l3.val);
    }

    @Test
    public void addTwoNumbers_2() throws Exception {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);

        ListNode l3 = this.solution.addTwoNumbers(l1, l2);
        assertEquals(2, l3.val);
        assertEquals(4, l3.next.val);
    }

    @Test
    public void addTwoNumbers_3() throws Exception {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode l3 = this.solution.addTwoNumbers(l1, l2);
        assertEquals(7, l3.val);
        assertEquals(0, l3.next.val);
        assertEquals(8, l3.next.next.val);
    }

    @Test
    public void name() throws Exception {
        long value = 9999999991l;
    }
}
