package linkedListPractice;

class myLinkedList<T> {
    private Node head;   // to start the LL
    private Node tail;  // indicate the LL


    void add(T data) {
        Node<T> node = new Node<>(data);
        if (tail == null) {
            head = node; // the only place where the head is set
            tail = node;
        } else {
            tail.setNextNode(node);
            node.setPreviousNode(tail);
            tail = node;
        }
    }


    // TODO : for doubly LL
    Node delete(T data) {
        Node nodeToReturn = null;
        Node node = head;
        /*
        * TODO:
        *       return the node if found
        *       check if the node is null or has element
        *       traverse through the LL to get its previous and next elements
        *       point the previous element to the next element
        * */
        nodeToReturn = find(data); // find the node in the linkedlist
        if (nodeToReturn == null) {
            System.out.println("Data not present");
            return null;
        } else {
            while (node.getNextNode() != null) { // node is the current node; node.getNextNode() is the next node
                if (node.getNextNode().getData() == data) {
                    node.setNextNode(node.getNextNode().getNextNode()); // setting the previous node pointer to the next node
                }
            }
        }
        return nodeToReturn;

    }

    // TODO: doubly linkedlist
    Node find(T data) {
        Node node = head;

        if (node.getData() == data) {
            return node; // if head is to be found
        }

        Node nodeToReturn = null;
        while (node.getNextNode() != null) { // checks if the next node is present
            node = node.getNextNode(); // stores the next node or node to be found
            if (node.getData() == data) {
                nodeToReturn = node; // setting the nodetoReturn to the found node
            }
        }
        return nodeToReturn;
    }

    // TODO: Doubly LinkedList
    void traverse() {
        Node node = head;
        if (node == null) {
            System.out.println("Linked List is empty");
        } else {
            while (node != null) {
                System.out.print(node.getData() + " | ");
                node = node.getNextNode();
            }
            System.out.println();
        }
    }
}
