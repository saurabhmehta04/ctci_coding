package challenges;
/**
 * Write a program to reverse a linkedlist
 * ex : 1 -> 2 -> 3 -> 4 -> null
 * output : 4 -> 3 -> 2 -> 1 -> null
 * */
public class reverseLinkedList {
    class Node {
        int data;
        Node nextNode;

        /*
        * Constructor : will construct the node with its data
        * */
        Node(int data) {
            this.data = data;
            this.nextNode = null;
        }
    }

    Node head;
    Node tail;



    void add(int num) {
        Node node = new Node(num);

        // if there are no elements, then make it the head
        if (head == null) {
            head = node;
            tail = node;
            node.nextNode = null;
        } else {
            tail.nextNode = node; // current last element nextNode => new node element
            tail = node; // make the tail node element
            tail.nextNode = null;
        }
    }

    void traverse() {
        if (head == null) {
            System.out.println("LinkedList is empty");
        } else {
            Node node = head;
            while (node != null) {
                System.out.print(node.data + " -> ");
                node = node.nextNode;
            }
            System.out.println("null");
        }
    }

    void revLinkedList() {
        Node temp = null;
        Node node = head;
        while (node != null) {
            Node next = node.nextNode;
            node.nextNode = temp;
            temp = node;
            node = next;
        }
        head = temp;

    }


    public static void main(String[] args) {
        reverseLinkedList ll = new reverseLinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.traverse();
        ll.revLinkedList();
        ll.traverse();

    }
}
