package com.codingr.algorithm;

import com.codingr.algorithm.basic.ListNode;

public class Main {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);

        System.out.println(node.next.data);
    }
}
