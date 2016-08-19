package stack;

public class StackMain {

    public static void main(String[] args) {
        Stack st = new Stack(10);
        st.push(1);
        st.push(2);
        st.push(3);

        st.traverse();

        System.out.println(st.pop());
        st.traverse();
    }
}