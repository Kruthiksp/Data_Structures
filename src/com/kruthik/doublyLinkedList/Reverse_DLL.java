package com.kruthik.doublyLinkedList;

public class Reverse_DLL {
    public static void main(String[] args) {
        DoublyLinkedListClass dll = new DoublyLinkedListClass();

        // Insert at Tail
        dll.insertAtTail(10);
        dll.insertAtTail(20);
        dll.insertAtTail(30);
        dll.insertAtTail(40);
        dll.insertAtTail(50);
        dll.display();
        NodeClass temp = dll.reverse(dll.head);
        dll.display();
    }
}
