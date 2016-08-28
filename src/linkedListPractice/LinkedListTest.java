package linkedListPractice;

public class LinkedListTest {
    public static void main(String[] args) {
        myLinkedList<String> ll = new myLinkedList<>();

        ll.add("First Node");
        ll.add("Second Node");
        ll.add("Third Node");

        ll.traverse();
    }
}
