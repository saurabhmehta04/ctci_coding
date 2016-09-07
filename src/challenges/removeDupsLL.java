package challenges;

import java.util.HashSet;

/**
 * Write a program to remove the duplicate elements from an unsorted linkedlist. (assume it is a doubly linkedlist
 * FOLLOW UP : re-write it if no buffers are allowed
 */

// Node class that is a blueprint of each node in the linkedlist
class Node<T> {
    T data;
    Node<T> next;
    Node<T> previous;

    public Node(T data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
    // can implement setters and getters if required; for now keepin it simple
}

// myLinkedlist class is the representation of the linkedlist
class myLinkedList<T> {
    Node<T> head;
    Node<T> tail;


    void addData(T n) {
        Node<T> node = new Node<T>(n);
        if (tail == null) {
            // ll is empty
            head = node;
            tail = node;
        } else {
            Node<T> currenNode = tail;
            currenNode.next = node;
            node.previous = currenNode;
            tail = node;
        }
    }

    void traverse() {
        if (tail == null) {
            System.out.println("LinkedList is empty");

        } else {
            Node node = head;
            while (node != null) {
                System.out.print(node.data + " | ");
                node = node.next; // for the last element it will be null
            }
        }
    }

    void delete(T n) {
        Node<T> nodeToDelete = find(n);
        if (nodeToDelete == null) {
            System.out.println("Data not in the linkedlist.");
        } else {
            nodeToDelete.previous.next = nodeToDelete.next;
            if (nodeToDelete.next != null) {
                nodeToDelete.next.previous = nodeToDelete.previous;
            }

        }

    }

    Node<T> find(T data) {
        Node<T> node = head;
        Node<T> nodeToReturn = null;
        while (node != null) {
            if (node.data == data) {
                nodeToReturn = node;
            }
            node = node.next;
        }
        return nodeToReturn;
    }

    void removedupsWithBuffer() {
        HashSet<T> data = new HashSet<>(); // additional buffer
        Node<T> node = head;
        while (node != null) {
            if (data.contains(node.data)) {
                node.previous.next = node.next;
                if (node.next != null) {
                    node.next.previous = node.previous;
                }
            } else {
                data.add(node.data); //adding to the set
            }
            node = node.next;
        }
    }


    void removedupsWithoutBuffer() {
        Node<T> node = head;
        Node<T> nextNode;
        while (node != null) {
            nextNode = node.next;
            while (nextNode != null) {
                if (node.data == nextNode.data) {
                    nextNode.previous.next = nextNode.next;
                    if (nextNode.next != null) {
                        nextNode.next.previous = nextNode.previous;
                    }
                } nextNode = nextNode.next;

            } node = node.next;
        }
    }
}


public class removeDupsLL<T> {

    public static void main(String[] args) {
        myLinkedList<Integer> ll = new myLinkedList<>();
        ll.addData(10);
        ll.addData(40);
        ll.addData(40);
        ll.addData(20);
        ll.addData(10);

        ll.traverse();
        System.out.print("\nRemove Duplicates from LL : ");
        ll.removedupsWithBuffer(); // Time complexity of O(N)
        // ll.removedupsWithoutBuffer(); // Time complexity of O(N^2)
        ll.traverse();

        ll.delete(40);
        System.out.println();
        ll.traverse();

        ll.delete(20);
        System.out.println();
        ll.traverse();
    }
}
