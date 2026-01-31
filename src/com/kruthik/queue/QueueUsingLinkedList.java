package com.kruthik.queue;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class MyQueue {
    private Node head;
    private Node tail;
    private int length;

    public void add(int x) {
        Node node = new Node(x);
        if (head == null) head = tail = node;
        else {
            tail.next = node;
            tail = tail.next;
        }
        length++;
    }

    public int remove() {
        if (head == null) {
            System.out.println("Queue is Empty...");
            return -1;
        }
        int num = head.data;
        head = head.next;
        length--;
        return num;
    }

    public int peek() {
        if (head == null) {
            System.out.println("Queue is Empty...");
            return -1;
        } else {
            return head.data;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Queue is Empty...");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int size() {
        return length;
    }
}

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();
        System.out.println(q.remove());
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size());
    }
}
