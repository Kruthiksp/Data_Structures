package com.kruthik.stack;

import java.util.Stack;

/*
    You are given the head of a linked list.
    Remove every node which has a node with a greater value anywhere to the right side of it.
 */
public class RemoveNodesFromLinkedList {
    public static void main(String[] args) {

//        ListNode ans = removeNodes();
    }

    public static ListNode removeNodes(ListNode head) {
        ListNode temp = head;
        Stack<Integer> s = new Stack<>();

        while(temp != null) {
            int x = temp.val;

            while(!s.isEmpty() && x > s.peek()) s.pop();
            s.push(x);

            temp = temp.next;
        }

        ListNode head2 = null;
        while(!s.isEmpty()) {
            ListNode n = new ListNode(s.pop());
            n.next = head2;
            head2 = n;
        }
        return head2;
    }
}
