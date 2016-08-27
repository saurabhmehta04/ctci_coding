package stack;

/*
* StackUsingArrays implementation using arrays
* P.S : Implementing stack using arrays is not efficient as the storage space is not freed
* when an item is deleted
* */
class StackUsingArrays {

    /*Building stack using arrays
    * Input => stack(5) ; stack array of size 5
    *          stack.push(3); should push it to the top of the stack
    *          stack.remove(3); if exist, should remove the element
    *          stack.peek(); return the top element in the stack
    *          stack.isEmpty(); return true for empty stack, false otherwise
    * Output => 1 | 2 | 3 | 4 |
     *          bottom         top
    *
    * */

    private int top; // keeping track of the top of the element
    private int[] data;
    private int head;
    private int tail;

    // Constructor: takes in size and makes the array initializing every index in the array to -1
    StackUsingArrays(int size) {
        // Todo: validate the size to accept only integers
        data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = -1;
        }
        top = -1;
    }

    void push(int num) {
        // Todo: check for the array size; if full return error
        data[top + 1] = num;
        top++;
    }

    int pop() {
        int x = 0;
        if (top != -1) {
            x = data[top];
            data[top] = -1;
            top--;
        }
        return x;
    }

    void peek() {
        System.out.println(data[top]);
    }

    boolean isEmpty() {
        return (top == -1);
    }

    void traverse() {
        for (int element : data) {
            System.out.print(element+ " ");
        }
        System.out.println();
    }
}
