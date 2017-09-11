package com.pengttyy;

import java.math.BigInteger;

class Solution {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        //解析
        BigInteger val1 = parseBitInt(l1);
        BigInteger val2 = parseBitInt(l2);

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

    private String[] calculate(BigInteger val1, BigInteger val2) {
        BigInteger result = val1.add(val2);
        StringBuilder reverse = new StringBuilder().append(result).reverse();
        return reverse.toString().split("");
    }

    private BigInteger parseBitInt(ListNode rootNode) {
        StringBuilder stringBuilder = new StringBuilder();
        ListNode tempListNode = rootNode;
        while (tempListNode != null) {
            stringBuilder.append(tempListNode.val);
            tempListNode = tempListNode.next;
        }
        return new BigInteger(stringBuilder.reverse().toString());
    }
}
