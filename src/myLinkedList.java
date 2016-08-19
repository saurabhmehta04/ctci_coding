class myLinkedList {

    // LinkedList need a head and a tail
    private Node head; // point to the start of the node
    private Node tail; // point to the end of the node
    private int size = 0; // size of the linkedlist

    void add(int num) {
        Node node = new Node(num);
        // scenario 1: linkedList is empty
        if (tail == null) {
            head = node;
            tail = node;
        } else { // scenario 2: non-empty linkedlist
            // tail.setNextNode(node); // set the tail pointer to the new node
            // tail.setData(node.getData()); // point the tail to this node

            //set the current tail to point to the new node
            tail.setNextNode(node);
            // this should set the tail.nextNode and data to the passed node
            tail = node;

        }
        size++;

    }

    Node delete(int data) {
        //    scenario 1: empty linkedlist
        //    scenario 2: non-empty linkedlist
        //    scenario 3: delete element from tail
        //    scenario 2: delete element from head
        //    scenario 2: delete element from mid or area other than head and tail
        //    previous node => next node
        Node nodeToReturn = null;
        // no elements
        if (size == 0) {
            return null;
        }
        // only 1 element
        //TODO : size 1 should NOT delete un-matched data
        if (size == 1) {
            nodeToReturn = head;
            head = null;
            tail = null;
            size--;
        }

        // more than 1 elements
        Node nodeBeforeNodeToDelete = findNodeBefore(data);
        if (nodeBeforeNodeToDelete != null) {
            // iterate through the list
            if (tail.getData() == data) {
                nodeBeforeNodeToDelete.setNextNode(new Node());
                tail = nodeBeforeNodeToDelete;
            } else {
                nodeBeforeNodeToDelete.setNextNode(nodeBeforeNodeToDelete.getNextNode().getNextNode());
            }
            size--;
        }

        return nodeToReturn;
    }

    /**
     * If this method returns empty linkedlist, then it means that the element to delete is
     * the head in the linkedlist. Returns null if not found and
     * returns a populated node if found one.
     *
     * @param data : data to delete
     * @return empty (if head), null (if not found) and Node (if found)
     */
    private Node findNodeBefore(int data) {
        // check for the first element
        if (head.getData() == data) {
            return new Node(); // returning empty node to indicate head is to be deleted
        }

        Node node = head;
        while (node.getNextNode() != null) {
            if (node.getNextNode().getData() == data) {
                return node;
            }
            node = node.getNextNode(); // since node is pointing to the head, setting node to the next node
        }
        return null;
    }


    Node find(int data) {
        if (head == null) {
            return null;
        }
        // check for the first element
        if (head.getData() == data) {
            return head;
        }

        Node node = head;
        while (node.getNextNode() != null) {
            node = node.getNextNode(); // since node is pointing to the head, setting node to the next node
            if (node.getData() == data) {
                return node;
            }

        }
        return null;
    }


    void traverse() {
        if (head != null) {
            Node node = head;
            System.out.println(head);
            while (node.getNextNode() != null) {
                node = node.getNextNode();
                System.out.println(node);
            }
        }
    }
}









