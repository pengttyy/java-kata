package com.pengttyy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution2Test {
    private Solution2 solution;

    @Before
    public void setUp() throws Exception {
        this.solution = new Solution2();
    }

    @Test
    public void addTwoNumbers_1() throws Exception {
        assertExecute("1", "2", "3");
    }

    @Test
    public void addTwoNumbers_1_2() throws Exception {
        assertExecute("5", "7", "21");
    }

    @Test
    public void addTwoNumbers_2_1() throws Exception {
        assertExecute("23", "54", "77");
    }

    @Test
    public void addTwoNumbers_2_2() throws Exception {
        assertExecute("243", "564", "708");
    }

    @Test
    public void addTwoNumbers_3_1() throws Exception {
        assertExecute("1835", "13", "2145");
    }

    @Test
    public void addTwoNumbers_3_2() throws Exception {
        assertExecute("899", "2", "0001");
    }

    private void assertExecute(String arg1, String arg2, String expected) {
        ListNode l3 = this.solution.addTwoNumbers(encapsulation(arg1), encapsulation(arg2));
        StringBuilder actualSb = new StringBuilder();
        ListNode temp = l3;
        while (temp != null) {
            actualSb.append(temp.val);
            temp = temp.next;
        }
        assertEquals(expected, actualSb.toString());
    }

    private ListNode encapsulation(String str) {
        String[] nums = str.split("");
        ListNode root = new ListNode(Integer.parseInt(nums[0]));
        ListNode temp = root;
        for (int i = 1; i < nums.length; i++) {
            ListNode listNode = new ListNode(Integer.parseInt(nums[i]));
            temp.next = listNode;
            temp = listNode;
        }
        return root;
    }
}
