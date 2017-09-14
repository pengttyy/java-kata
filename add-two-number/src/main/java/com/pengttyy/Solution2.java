package com.pengttyy;

/**
 * Created by wseng9 on 2017/9/12.
 */
public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rootNode = null;

        ListNode tempNode1 = l1;
        ListNode tempNode2 = l2;
        int offset = 0;
        while (tempNode1 != null && tempNode2 != null) {
            int val = tempNode1.val + tempNode2.val + offset;
            offset = 0;
            if (val >= 10) {
                rootNode = new ListNode(val % 10);
                offset = 1;
                return rootNode;
            }
        }

        int x = l1.val + l2.val;
        if (x >= 10) {
            rootNode = new ListNode(x % 10);
            rootNode.next = new ListNode(1);
            return rootNode;
        }
        return new ListNode(x);
    }
}
