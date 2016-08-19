package stack;

/*
* Stack implementation using arraylist
* */
class Stack {

    /* Arrays => fixed size √ 
    * Add and remove elements from the array from front or back 
    * saves the order in which they are added 
    * */

    private int[] stck;
    private int top;
    private int size = 0;

    Stack(int size) {
        stck = new int[size];
        this.size = size;
        top = -1;
    }

    // add data to the top of the stack
    void push(int data) {
            stck[++top] = data;
            size++;

    }

    int pop() {
        size--;
        return stck[top--];
    }

    // print the entire stack
    void traverse() {
        int temp = top;
        System.out.println("size of the stack : " + size);
        while (temp != -1) {
            System.out.print(stck[temp--] + " | ");
        }
        System.out.println();
        for (int num : stck) {
            System.out.print(num + " |  ");
        }
        System.out.println();
    }

}
