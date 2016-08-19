package linkedList;

// linkedList.Node class to represent each node in the LinkedList
class Node {
    private int data;
    private Node nextNode;

    Node() {
    }

    Node(int data) {
        this.data = data;
        this.nextNode = null;
    }

    int getData() {
        return data;
    }

    void setData(int data) {
        this.data = data;
    }

    Node getNextNode() {
        return nextNode;
    }

    void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "" + data;
    }

}