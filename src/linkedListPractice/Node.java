package linkedListPractice;


/* Node class
* represents each node in a linkedlist data structure
* */
class Node<T> {
    private T data;
    private Node nextNode;
    private Node previousNode;

    Node(T data) {
        this.data = data;
        this.nextNode = null;
        this.previousNode = null;
    }

    // Getters and setters
    T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    Node getNextNode() {
        return nextNode;
    }

    void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

    @Override
    public String toString() {
        return "" + data;
    }
}
