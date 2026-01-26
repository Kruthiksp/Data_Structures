package com.kruthik.doublyLinkedList;

public class DLL_DataStructure {
    public static void main(String[] args) {
        DoublyLinkedListClass dll = new DoublyLinkedListClass();

        // Insert at Tail
        dll.insertAtTail(10);
        dll.insertAtTail(20);
        dll.insertAtTail(30);
        dll.insertAtTail(40);
        dll.insertAtTail(50);
        dll.display();
        System.out.println("Inserted at Tail\n");

        // Insert at Head
        dll.insertAtHead(5);
        dll.insertAtHead(0);
        dll.display();
        System.out.println("Inserted at Head\n");

        // Delete at Head
        dll.deleteAtHead();
        dll.display();
        System.out.println("Deleted at Head\n");

        // Delete at Tail
        dll.deleteAtTail();
        dll.display();
        System.out.println("Deleted at Tail\n");

        // Insert at a Index
        dll.insertAtIndex(2, 15);
        dll.display();
        System.out.println("Inserted At Index\n");

        // Delete at a Index
        dll.deleteAtIndex(1);
        dll.display();
        System.out.println("Deleted At Index\n");

        // Display Reverse
        dll.displayReverse();
        System.out.println("Reverse Display of Linked List\n");

    }
}
