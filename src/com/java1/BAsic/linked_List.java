package com.java1.BAsic;

public class linked_List {
    /*
    Creation of node class,
    InsertatBeginning, Insert, InsertatEnd, delete, print
     */
    Node head;

    class Node {
        Node next;
        int data;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void InsertAtBeginning(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public void Insert(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = new_node;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        linked_List ll = new linked_List();
        ll.Insert(65);
        ll.Insert(34);
        ll.printList();
    }
}


