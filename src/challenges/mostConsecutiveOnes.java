package challenges;

import java.lang.reflect.Array;
import java.util.*;

public class mostConsecutiveOnes {

    private static int mostConsecutiveOne(int n) {
        String[] str = Integer.toBinaryString(n).split("0"); //1101111

        int tmp = 0;
        for (String s : str) {
            if (tmp < s.length()) { // tmp is greater than the length
                tmp = s.length();
            }
        }
        Arrays.sort(str, Collections.reverseOrder());
        for (String st : str) {
            System.out.print(st + " ");
        }
        System.out.println();
        return tmp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        System.out.println(mostConsecutiveOne(n));
    }
}
