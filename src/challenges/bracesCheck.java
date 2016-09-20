package challenges;

import java.util.Scanner;
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
            //if the previous string is not balanced, there would be element(s) in the stck, so empty out the stck
            while (!stck.empty()) {
                stck.pop();
            }
        }
        return bool;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String s[] = new String[t];
        for(int a0 = 0; a0 < t; a0++){
            s[a0] = in.next();
        }
        // String[] values = {"{[()]}", "{[(])}", "{{[[(())]]}}", "}}}"};
        String[] bool = Braces(s);
        System.out.print("Balanced : ");
        for (String str : bool) {
            System.out.print(str + " ");

        }
    }
}
