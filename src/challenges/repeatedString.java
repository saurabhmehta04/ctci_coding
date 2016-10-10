package challenges;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Created by Falcon on 10/6/16.
 */
public class repeatedString {
    public static void main(String[] args) {



        String str = "Saurabh";

    //    creating a hashmap to keep track of the count
        Hashtable<Character, Integer> charCountMap = new Hashtable<>(); // not needed to implement the linkedhashmap because we are going to iterate over the string.

    //    converting the string to chararray
        char[] chrArray = str.toCharArray();

        for (char c : chrArray) {
            if (charCountMap.containsKey(c)) {
            //    if it contains in the hashmap, increment its count by 1
                charCountMap.put(c, charCountMap.get(c) + 1); // get the key and add it by 1

            } else {
                charCountMap.put(c, 1);
            }
        }

        System.out.println(charCountMap);

    //    checking for the first repeating characters

        for (char ch : chrArray) { // S a u r a b h
            System.out.print(ch + " ");
            if ((charCountMap.get(ch) > 1)) {
                System.out.println("The first repeating character  : " + ch);
                break;

            }
        }

    //    checking for the first non-repeating characters
        for (char ch : chrArray) {
            if (charCountMap.get(ch) == 1) {
                System.out.println("The first non-repeating character  : " + ch);
                break;

            }
        }
    }
}
