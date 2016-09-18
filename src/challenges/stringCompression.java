package challenges;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program to perform String compression
 * ex : aabaaaaccc => a2b1a4c3
 */
public class stringCompression {


    private static void stringCompression(String str) {
        char charArray[] = str.toCharArray();

        ArrayList<Character> compressedArray = new ArrayList<>(); // a
        ArrayList<Integer> count = new ArrayList<>();

        // aabaaaaccc
        // compressedArray.add(charArray[0]);
        char prev = charArray[0]; // b
        int counter = 0; // 1
        for (char element : charArray) { // abc
            if (prev == element) {
                counter++;
            } else {
                compressedArray.add(prev); // a
                count.add(counter);
                counter = 1;
                prev = element;

            }
        }
        //add in the last element and its count
        compressedArray.add(prev);
        count.add(counter);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < compressedArray.size(); i++) {
            stringBuilder.append(compressedArray.get(i));
            stringBuilder.append(count.get(i));
        }

        System.out.println(compressedArray.toString());
        System.out.println(count.toString());
        System.out.println(stringBuilder);

    }


    private static void stringCompressionEfficient(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int counter = 0;
        char prev = str.charAt(0);

        for (char element : charArray) {
            if (prev == element) {
                counter++;
            }
            else {
                stringBuilder.append(prev);
                stringBuilder.append(counter);
                prev = element;
                counter = 1;
            }
        }
        // adding the last element
        stringBuilder.append(prev);
        stringBuilder.append(counter);

        System.out.println(stringBuilder);

    }

    public static void main(String[] args) {
        System.out.print("Enter your string :  ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine(); //aabaaaaccc

        stringCompression(str);
        stringCompressionEfficient(str);

    }
}
