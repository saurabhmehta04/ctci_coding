package challenges;
import java.util.*;
public class staicase{
    private static void printStaircase(int n) {
        for (int i = 1; i <= n; i++) { // keep track of rows
            for (int j = 1; j <= n; j++) { // each row contents
                if ((i+j)<=n) { // 1>1
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printStaircase(n);
    }
}