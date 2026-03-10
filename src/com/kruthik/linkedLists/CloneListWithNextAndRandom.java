package com.kruthik.linkedLists;

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

    public Node cloneLinkedList(Node head) {
        if (head == null) return head;

        // Create copy list
        Node copyHead = new Node(head.data);
        deepCopy(head, copyHead);

        // Interleave original & copy nodes
        Node combinedHead = alternateConnection(head, copyHead);

        // Set random pointers for copied nodes
        randomConnections(combinedHead);

        // Separate lists & restore original
        return separateLists(combinedHead);
    }

    public void deepCopy(Node originalHead, Node copyHead) {
        Node temp1 = originalHead;
        Node temp2 = copyHead;

        while (temp1.next != null) {
            Node n = new Node(temp1.next.data);
            temp2.next = n;

            temp1 = temp1.next;
            temp2 = temp2.next;
        }
    }

    public Node alternateConnection(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node temp = dummy;
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null && temp2 != null) {
            temp.next = temp1;
            temp = temp.next;
            temp1 = temp1.next;

            temp.next = temp2;
            temp = temp.next;
            temp2 = temp2.next;
        }
        return dummy.next;
    }

    public void randomConnections(Node head) {
        Node temp1 = head;
        Node temp2 = head.next;

        while (temp1 != null && temp2 != null) {
            if (temp1.random != null) {
                temp2.random = temp1.random.next;
            }
            temp1 = temp1.next.next;
            if (temp2.next != null) temp2 = temp2.next.next;
        }
    }

    public Node separateLists(Node head) {
        Node originalHead = head;
        Node copyHead = head.next;
        Node copy = copyHead;

        while (originalHead != null) {
            originalHead.next = originalHead.next.next;

            if (copy.next != null) {
                copy.next = copy.next.next;
            }
            originalHead = originalHead.next;
            copy = copy.next;
        }
        return copyHead;
    }
}
