package com.kruthik.DoublyLinkedList;

public class DoublyLinkedListClass {
    NodeClass head;
    NodeClass tail;
    int size;

    public void insertAtHead(int data) {
        NodeClass temp = new NodeClass(data);

        if (head == null) head = tail = temp;

        temp.next = head;
        head.prev = temp;
        head = temp;

        size++;
    }

    public void insertAtTail(int data) {
        NodeClass temp = new NodeClass(data);

        if (head == null) head = tail = temp;

        tail.next = temp;
        temp.prev = tail;
        tail = temp;

        size++;
    }

    public void insertAtIndex(int idx, int data) {
        if (idx == 0) {
            insertAtHead(data);
            return;
        } else if (idx == size) {
            insertAtTail(data);
            return;
        } else if (idx > size || idx < 0) {
            System.out.println("Invalid Index to Insert a Element");
            return;
        }

        NodeClass ele = new NodeClass(data);

        NodeClass temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        ele.next = temp.next;
        temp.next = ele;
        ele.prev = temp;
        ele.next.prev = ele;

        size++;
    }

    public void deleteAtIndex(int idx) {
        if (idx == 0) {
            deleteAtHead();
            return;
        } else if (idx == size - 1) {
            deleteAtTail();
            return;
        } else if (idx >= size || idx < 0) {
            System.out.println("Invalid Index to Delete a Element");
            return;
        }

        NodeClass temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
        size--;
    }

    public void deleteAtHead() {
        if (size > 1) {
            head = head.next;
            head.prev = null;
        } else {
            head = tail = null;
        }
        size--;
    }

    public void deleteAtTail() {
        if (size > 1) {
            tail = tail.prev;
            tail.next = null;
        } else {
            head = tail = null;
        }
        size--;
    }

    public void display() {
        if (head == null) System.out.println("Linked List is Empty");

        NodeClass temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void displayReverse() {
        if (tail == null) System.out.println("Linked List is Empty");

        NodeClass temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public NodeClass reverse(NodeClass head) {
        NodeClass prev = null;
        NodeClass crnt = head;
        NodeClass frwd = null;

        while (crnt != null) {
            frwd = crnt.next;
            crnt.next = prev;
            crnt.prev = frwd;

            prev = crnt;
            crnt = frwd;
        }

        NodeClass temp = this.head;
        this.head = this.tail;
        this.tail = temp;

        return prev;
    }

}
