package com.kruthik.stack;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class MyStack {
    Node head;
    int length;

    public void push(int data) {
        Node temp = new Node(data);

        // Establishing connection between head and temp
        if(length > 0) temp.next = head;

        head = temp;
        length++;
    }

    public int pop() {
        if(length == 0) {
            System.out.println("Stack is Empty...");
            return -1;
        };
        int val = head.data;
        head = head.next;
        length--;
        return val;
    }

    public int peek() {
        if(head == null) {
            System.out.println("Stack is Empty...");
            return -1;
        }
        return head.data;
    }

    int size() {
        return length;
    }

    public void display() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        MyStack s = new MyStack();

        for (int i = 0; i <= 5; i++) s.push(i*10);

        s.display();
        System.out.println("Removing the Top Element: " + s.pop());
        s.display();
        System.out.println("Viewing the Top Element: " + s.peek());
        System.out.println("Size of the Stack: " + s.size());
    }
}
