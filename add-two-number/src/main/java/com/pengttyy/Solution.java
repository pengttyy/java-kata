package com.pengttyy;

import java.util.Objects;

class Solution {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    ListNode addTwoNumber(ListNode l1, ListNode l2) {
        //
        Objects.requireNonNull(l1,"l1参数不可为null");
        Objects.requireNonNull(l2,"l2参数不可为null");
        //解析
        int val1 = parseInt(l1);
        int val2 = parseInt(l2);

        //计算
        String[] nums = calculate(val1, val2);

        //包装
        return encapsulation(nums);
    }

    private ListNode encapsulation(String[] nums) {
        ListNode root = new ListNode(Integer.parseInt(nums[0]));
        ListNode temp = root;
        for (int i = 1; i < nums.length; i++) {
            ListNode listNode = new ListNode(Integer.parseInt(nums[i]));
            temp.next = listNode;
            temp = listNode;
        }
        return root;
    }

    private String[] calculate(int val1, int val2) {
        int result = val1 + val2;
        StringBuilder reverse = new StringBuilder().append(result).reverse();
        return reverse.toString().split("");
    }

    private int parseInt(ListNode rootNode) {
        StringBuilder stringBuilder = new StringBuilder();
        ListNode tempListNode = rootNode;
        while (tempListNode != null) {
            stringBuilder.append(tempListNode.val);
            tempListNode = tempListNode.next;
        }
        return Integer.parseInt(stringBuilder.reverse().toString());
    }
}
