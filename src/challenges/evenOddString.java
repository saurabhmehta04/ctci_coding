package challenges;

import java.io.*;
import java.util.*;

public class evenOddString{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // 1
        String[] arr = new String[n]; // making the array of n elements

        for(int i = 0; i< arr.length; i++) {
            arr[i] = scan.next();
        }

        StringBuilder strEven = new StringBuilder();
        StringBuilder strOdd = new StringBuilder();

        for(int j = 0; j < arr.length; j++) { // over elements
            for(int i = 0; i < arr[j].length(); i++) { // over each element
                if(i%2 == 0) { // if even
                    strEven.append(arr[j].charAt(i));
                } else { // if odd
                    strOdd.append(arr[j].charAt(i));
                }
            }
            System.out.println(strEven + " " + strOdd);
            strEven = new StringBuilder();
            strOdd = new StringBuilder();
        }


    }
}