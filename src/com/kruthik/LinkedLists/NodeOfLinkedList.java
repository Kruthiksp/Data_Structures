package com.kruthik.LinkedLists;

public class NodeOfLinkedList {
    public static void main(String[] args) {
        System.out.println("\nNOTE: Address may vary on each Run\n");
        // Create a NodeClass
        NodeClass a = new NodeClass(10);  // LinkedLists.NodeClass@6d03e736
        NodeClass b = new NodeClass(20);  // LinkedLists.NodeClass@568db2f2
        NodeClass c = new NodeClass(30);  // LinkedLists.NodeClass@378bf509
        NodeClass d = new NodeClass(40);  // LinkedLists.NodeClass@5fd0d5ae
        NodeClass e = new NodeClass(50);  // LinkedLists.NodeClass@2d98a335

        // assign Values
//        a.val = 10;
//        b.val = 20;
//        c.val = 30;
//        d.val = 40;
//        e.val = 50;

        // Connecting NodeClasss
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        // Address of c
        System.out.println(c);
        System.out.println(b.next);
        System.out.println(a.next.next);

    }
}


