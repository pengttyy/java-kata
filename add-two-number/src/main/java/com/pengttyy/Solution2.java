package com.pengttyy;

/**
 * Created by wseng9 on 2017/9/12.
 */
public class Solution2 {
    boolean offset = false;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = l1;
        root.val = cal(l1.val + l2.val);

        ListNode current = root;
        ListNode tempListNodel1 = l1.next;
        ListNode tempListNodel2 = l2.next;
        while (tempListNodel1 != null && tempListNodel2 != null) {
            tempListNodel1.val = (cal(tempListNodel1.val + tempListNodel2.val));
            current = current.next = tempListNodel1;
            tempListNodel1 = tempListNodel1.next;
            tempListNodel2 = tempListNodel2.next;
        }

        ListNode listNode = tempListNodel1 != null ? tempListNodel1 : tempListNodel2;
        while (listNode != null) {
            current = current.next = listNode;
            listNode.val = cal(listNode.val);
            if (!offset) {
                return root;
            }
            listNode = listNode.next;
        }

        if (offset) {
            current.next = new ListNode(1);
        }
        return root;
    }

    private int cal(int num) {
        int val = num + (offset ? 1 : 0);
        if (val >= 10) {
            offset = true;
            return val % 10;
        }
        offset = false;
        return val;
    }
}
