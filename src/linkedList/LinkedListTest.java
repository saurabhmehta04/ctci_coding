package linkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        myLinkedList list = new myLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Done");
        System.out.println(list.find(30));
        System.out.println();
        list.traverse();

        list.delete(20);

        System.out.println();

        list.traverse();
    }
}
