package com.kruthik.linkedLists;

// User-defined Data Structure
public class LinkedListClass {
    NodeClass head;
    NodeClass tail;
    int size;

    public void addAtHead(int val) {
        NodeClass temp = new NodeClass(val);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public void addAtTail(int val) {
        NodeClass temp = new NodeClass(val);

        if (head == null) {
            addAtHead(val);
            return;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public void deleteAtHead() {
        if (head == null) System.out.println("LinkedList is Empty!!!");
        else head = head.next;

        if (head == null) tail = null;
        size--;
    }

//    public void deleteAtTail() {
//        if (head == null) System.out.println("LinkedList is Empty!!!");
//        else {
//            NodeClass temp = head;
//
//            while (temp.next.next != null) {
//
//            }
//        }
//        if (head == null) tail = null;
//        size--;
//    }

    public void addAtMiddle(int val, int idx) {
        if (idx < 0 || idx >= size) return;

        NodeClass newNode = new NodeClass(val);
        NodeClass temp = head;
        int currentIdx = 0;
        while (temp != null) {
            if (idx == 0) {
                newNode.next = head;
                head = newNode;
                return;
            }
            if (currentIdx == idx - 1) {
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
            currentIdx++;
        }
    }

    public int search(int target) {
        if (head == null) return -1;
        NodeClass temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.val == target) return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    public void display() {
        if (head == null) return;

        NodeClass temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
