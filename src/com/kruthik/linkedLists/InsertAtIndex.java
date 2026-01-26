package com.kruthik.linkedLists;

public class InsertAtIndex {
    public static void main(String[] args) {
        LinkedListClass ll = new LinkedListClass();

        ll.addAtHead(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(50);

        ll.addAtMiddle(75, 7);
        ll.display();

    }
}
