package com.kruthik.LinkedLists;

public class TraverseLinkedList {
    public static void main(String[] args) {
        NodeClass a = new NodeClass(10);
        NodeClass b = new NodeClass(20);
        NodeClass c = new NodeClass(30);
        NodeClass d = new NodeClass(40);
        NodeClass e = new NodeClass(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);
    }

    public static void display(NodeClass head) {
        NodeClass temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
