package com.kruthik.linkedLists;

public class LinkedListDataStructure {
    public static void main(String[] args) {
        LinkedListClass ll = new LinkedListClass();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(50);
        System.out.print("After adding at the Tail: ");
        ll.display();
        System.out.println("Size of current linkedList is: " + ll.size);

        ll.addAtHead(5);
        ll.addAtHead(0);
        System.out.print("After adding at the Head: ");
        ll.display();
        System.out.println("Size of current linkedList is: " + ll.size);

        ll.deleteAtHead();
        System.out.print("After deleting from the Head: ");
        ll.display();
        System.out.println("Size of current linkedList is: " + ll.size);

        int search = ll.search(10);
        System.out.println((search != -1) ? "Element Exists At: " + search : "Doesn't Exist");
    }
}
