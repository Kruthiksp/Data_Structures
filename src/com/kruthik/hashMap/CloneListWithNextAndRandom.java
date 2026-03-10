package com.kruthik.hashMap;

import java.util.HashMap;

public class CloneListWithNextAndRandom {
    static class Node {
        int data;
        Node next;
        Node random;

        Node(int x) {
            data = x;
            next = null;
            random = null;
        }
    }

    public static Node cloneLinkedList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();

        Node copyHead = new Node(head.data);
        deepCopy(head, copyHead);

        Node tempA = head;
        Node tempB = copyHead;
        while (tempA != null) {
            map.put(tempA, tempB);
            tempA = tempA.next;
            tempB = tempB.next;
        }

        tempA = head;

        while (tempA != null) {
            // By doing this i will get the original random Not a Copy of Random
            // tempB.random = tempA.random;
            tempB = map.get(tempA);
            tempB.random = map.get(tempA.random);
            tempA = tempA.next;
        }

        return copyHead;
    }

    public static void deepCopy(Node originalHead, Node copyHead) {
        Node temp1 = originalHead;
        Node temp2 = copyHead;

        while (temp1.next != null) {
            Node n = new Node(temp1.next.data);
            temp2.next = n;

            temp1 = temp1.next;
            temp2 = temp2.next;
        }
    }
}
