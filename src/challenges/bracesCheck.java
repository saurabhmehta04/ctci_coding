package challenges;

import java.util.Stack;

public class bracesCheck {

    static String[] Braces(String[] values) {
        String[] bool = new String[values.length];

        Stack<Character> stck = new Stack<>(); //
        for (int i = 0; i < values.length; i++) { // ({[]}), ....
            String str = values[i];
            for (int j = 0; j < str.length(); j++) { // ( { [ ] } )
                if (!stck.isEmpty() && stck.peek() == '[' && str.charAt(j) == ']') stck.pop();
                else if (!stck.isEmpty() && stck.peek() == '{'  && str.charAt(j) == '}') stck.pop();
                else if (!stck.isEmpty() && stck.peek() == '('  && str.charAt(j) == ')') stck.pop();
                else stck.push(str.charAt(j)); // ( {
            }
            bool[i] = (stck.empty()) ? "YES" : "NO";
        }
        return bool;
    }

    public static void main(String[] args) {
        String[] values = {"[]{}()", "({[]})", "()(()))"};
        String[] bool = Braces(values);
        for (String str : bool) {
            System.out.print(str + " ");

        }
    }
}
