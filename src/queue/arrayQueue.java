package queue;

import java.util.*;

public class arrayQueue {

    private int[] Queue;
    private int front, rear, size, len; // size indicates the size / length of the array

    // Constructor to get the size of the array
    public arrayQueue(int size) {
        this.size = size;
        Queue = new int[size];
        len = 0;
        front = -1;
        rear = -1;

    }

    public boolean isEmpty() {
        return (front == -1);
    }

    public boolean isFull() {
        return front == 0 & rear == size - 1; // if front is == 0 and rear == size-1
    }

    public int getSize() {
        return len; // initialized to 0
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("No elements in the Queue");
        }
        return Queue[front];
    }

    public void insert(int i) {
        if (rear == -1) {
            front = 0;
            rear = 0;
            Queue[rear] = i;
        } else if (rear + 1 < size) {
            Queue[++rear] = i;

        } else if (rear + 1 > size) {
            throw new IndexOutOfBoundsException("Array is full");
        }
        len++;
    }

    public int remove() {
        if (front == -1) {
            throw new NoSuchElementException("Queue is empty");
        } else {
            len--;
            int returned = Queue[front];

            // for the last element to be removed
            if (front == rear) {
                front = -1;
                rear = -1;
            } else front++;
            return returned;
        }
    }

    public void display() {
    //    front and rear will be pointing to different elements in the array
        System.out.print("\n Queue = ");
        if (len == 0) {
            System.out.println("Empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(Queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        arrayQueue que = new arrayQueue(7);
        que.insert(10);
        que.insert(20);
        que.insert(30);
        // que.insert(40);
        // que.insert(50);
        // que.insert(60);
        // que.insert(70);
        // que.display();
        que.remove();
        que.remove();
        que.display();
        System.out.println(" \n Peek : " + que.peek());
        System.out.println("\n Size of the Queue : " + que.getSize());
        System.out.println("\n Is Queue Empty : " + que.isEmpty());
        System.out.println("\n Is Queue Full : " + que.isFull());


        Hashtable<Integer,String> myTable= new Hashtable<Integer,String>();
        myTable.put(1, "John");
        myTable.put(2, "Cena");
        // myTable.put(3, null); /* NullPointerEcxeption at runtime*/
        System.out.println(myTable.get(1));
        System.out.println(myTable.get(2));

    }
}
