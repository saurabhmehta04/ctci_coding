package challenges;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program to perform String compression
 * ex : aabaaaaccc => a2b1a4c3
 */
public class stringCompression {


    static void stringCompression() {
        System.out.print("Enter your string :  ");

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine(); //aabaaaaccc
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




    public static void main(String[] args) {
        stringCompression();


    }
}
