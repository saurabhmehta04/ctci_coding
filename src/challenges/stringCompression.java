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
            } else {
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
    /*
     * Complete the function below.
     */

    static String compress(String str) {
        int counter = 0;
        String result = "";
        ArrayList<Character> objList = new ArrayList<Character>();
        for (int i = 0; i < str.length(); i++) { //aabbbbcc
            char currentChar = str.charAt(i); // a

            // check if the next character exist
            if (!objList.contains(currentChar)) {
                // char nextChar = str.charAt(i);
                for (int j = i; j < str.length(); j++) { // o - length
                    if (currentChar == str.charAt(j)) { // a == a
                        counter++;  // 1
                    }
                }
                objList.add(currentChar);
                if (counter == 1) {
                    result = result + currentChar;
                } else {
                    result = result + currentChar + "" + counter;
                }
            }
            counter = 0;
        }

        return result;

    }

    /*
    * Function to print all the unique characters with their count
    * ex: aabbaacc => a4b2c2s*/

    static String compressString(String string) {

        String result = "";
        ArrayList<Character> arrayList = new ArrayList<>(); //ab
        int stringLength = string.length();
        int counter = 0; // 2
        for (int i = 0; i < stringLength; i++) { // aabbaacc
            char currentChar = string.charAt(i); // b 2

            // each character to compare with the rest
            if (!arrayList.contains(currentChar)) {
                arrayList.add(currentChar); // if arraylist does not contain the element, add to it
                for (int j = i; j < stringLength; j++) { // loop through to get the count 3
                    if (string.charAt(j) == currentChar) {
                        counter ++;
                    }
                }
                result = result + currentChar + counter; // a4b2
                counter = 0;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.print("Enter your string :  ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine(); //aabaaaaccc

        // stringCompression(str);
        // stringCompressionEfficient(str);
        System.out.println(compressString(str));
    }
}
