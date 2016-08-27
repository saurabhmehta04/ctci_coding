package stack;

public class StackMain {

    public static void main(String[] args) {
        StackUsingArrays stck = new StackUsingArrays(5);
        stck.push(1);
        stck.push(2);
        stck.push(3);
        stck.push(4);
        stck.push(5);
        stck.traverse();
        stck.pop();
        stck.traverse();

        stck.pop();
        stck.pop();
        stck.pop();
        stck.traverse();

        stck.push(3);
        stck.push(3);
        stck.push(10);
        stck.traverse();
        stck.peek();
        System.out.println(stck.isEmpty());

    }
}
