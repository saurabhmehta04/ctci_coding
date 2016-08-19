import java.util.*;

public class StringManipulation {

    /*
    * check if a string has all the unique characters
    *
    * */
    private static boolean isUniqueChars(String str) {

        if (str.length() > 128)
            return false; // considering it is ASCII, string cannot be bigger than 128 unique characters.

        boolean[] charSet = new boolean[128]; // for ASCII with 128 character set. If the character is not present make it true. return false if already present

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i); // Main logic of this method
            if (charSet[val]) { // already present => true in the boolean array
                return false;
            } else {
                charSet[val] = true; // if false => not present
            }
        }
        return true;
    }

    /*
    * permutation : check if a string is a permutation of another => both the strings have the same length
    * */

    // sorting function
    private static String sort(String str) {
        char[] contents = str.toCharArray();
        Arrays.sort(contents);
        return new String(contents); // primitive to Wrapper class (String, Integer, Character, etc) => autoboxing; reverse of this is unboxing
    }

    private static boolean isPermutable(String str1, String str2) {

    /*
    * Algo:
    * since two strings are equal, sorting both the strings would verify its permutability
    * ex: str1 = "dog" and str2 = "god" => after sorting => both the string will be dgo and
    * then a simple comparison of both the sorted string would solve the problem
    * */
        if (str1.length() != str2.length()) {
            return false;
        }

        // code refactor
        /*String newStr1 = sort(str1);
        String newStr2 = sort(str2);
        // System.out.println(newStr1 + " " + newStr2);
        int counter = 0; // keeping track of same characters in both the strings
        int i = 0; // keeping track of the number of characters
        for (; i < newStr1.length(); i++) {
            if (newStr1.charAt(i) == newStr2.charAt(i)) {
                counter++;
            }
        }
        // System.out.println(i + " " + counter);
        */

        return (sort(str1).equals(sort(str2)));
    }


    /*
    *
    * URLify: Replace space with "%20", given => string with true length
    * ex: "Mr John Smith    ", 13 => "Mr%20John%20Smith"
    *
    * */
    private static String urlify(String url, int length) {
        char[] contents = new char[url.length()];
        int space = 0;
        for (int i = 0; i < length; i++) {
            if (url.charAt(i) == ' ') {
                contents[space++] = '%';
                contents[space++] = '2';
                contents[space++] = '0';
            } else {
                contents[space] = url.charAt(i);
                space++;
                if (space > contents.length)
                    break;
            }
            System.out.println(contents);
        }
        return new String(contents);
    }

    /*
    * Function to print all the permutations of a string
    * Done: Refactor for the edge case for duplicate character like "aabc"
    * */

    private static void permute(String str) {
        int length = str.length();
        boolean[] used = new boolean[length];
        StringBuilder output = new StringBuilder(length);
        HashSet<String> set = new HashSet<>();
        permutation(str, length, output, used, 0, set);
        System.out.println(set); // print the set
    }

    // Recursive function for the string permutation => Backtracking
    private static void permutation(String str, int length, StringBuilder output, boolean[] used, int position, HashSet<String> set) {
        //    base condition
        if (position == length) {
            set.add(output.toString());
            // System.out.println(output.toString());

        } else {
            for (int i = 0; i < length; i++) {
                if (!used[i]) {
                    output.append(str.charAt(i));
                    used[i] = true;
                    permutation(str, length, output, used, position + 1, set);
                    output.deleteCharAt(output.length() - 1);
                    used[i] = false;
                }
            }
        }
    }

    /*
    *
    * Palindrome permutation: Given a string, write a function to check if it is a permutation of a palindrome
    * ex: Tact Coa => Permutation(taco cat), Palindrome(atco cta)
    *
    * Hints: You do not have to generate all the permutations, what characteristics would a string that is a permutation of a palindrome have,
    * Have you tried hash table ?, can you reduce the space usage by using a space vector
    *
    * */

    private static boolean permutPalindrome(String string) {


        // generate permutation of the string


        return false;
    }

    /*
    *
    * One away: There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a character. Given two strings,
    * write a function to check if they are one edit (or zero edits) away.
    * ex: pale, ple -> true
    * pales, pale -> true
    * pale, bale -> true
    * pale, bake -> false
    *
    * Hints: Start with the easy thing => can you check each of the conditions separately
    * WHat is the relationship between the "insert character" option and the "remove character" option ? Do these need to be two seperate checks ?
    * Can you do all three checks in a single pass ?
    * */

    private static boolean oneAway(String first, String second) {

        /*if (first.length() == second.length()) {
            return false;
        }*/
        int len1 = first.length();
        int len2 = second.length();

        if (len1 - len2 > 1 || len2 - len1 > 1) {
            return false;
        }

        int i = 0, j = 0;
        int diff = 0;
        while (i < len1 && j < len2) {
            char f = first.charAt(i);
            char s = second.charAt(j);
            if (f != s) {
                diff++;
                if (len1 > len2) {
                    i++;
                }
                if (len2 > len1) {
                    j++;
                }
                if (len1 == len2) {
                    i++;
                    j++;
                }
            } else {
                i++;
                j++;
            }
            if (diff > 1) {
                return false;
            }
        }
        return true;
    }
    /*
    * String compression: Implement a method to perform a basic string compression using the counts of repeated characters. For ex: the string "aabcccccaaa" would become a2b1c5a3.
    * if the "compressed" string would not become smaller than the original string, your method should return the original string.
    * you can assume the string has only the upper case and lower case letters.
    *
    * Hint: Do the easy thing first. Compress the string, then compare the strings
    * Be careful that you are NOT repeatedly concatenating strings together. This can be very inefficient.
    * */

    private static void compression(String string) {
        /*
        * have a list
        * keep a track of the previous list
        * loop through the list
        *   if the current char is same as previous
        *       increase the count
        *   else
        *       add to the list the previous char + count
        *       previous character = the current character in the loop
        *       count = 1 for the current character
        * result += prev + str(count) .. when we reach the end of the loop
        * make a string out of the result list
        * check for the length
        *   if result list is smaller than the original string return the result
        *   else return the original string*/

        StringBuilder strBuild = new StringBuilder();
        int count = 0;
        char prev = string.charAt(0);
        char[] charArray = string.toCharArray();

        for (char element : charArray) {
            if (prev == element) {
                count++;
            } else {
                strBuild.append(prev);
                strBuild.append(count);
                count = 1;
                prev = element;
            }
        }
        // last set of characters
        strBuild.append(prev);
        strBuild.append(count);
        System.out.println(strBuild);
    }

    /*
    * Reverse all the words in a sentence. Implement a function for reversing the words in a string s
    * ex: Alice likes Bob => Bob likes Alice
    *
    * Hint: We could reverse the entire sentence and then reverse each word.
    *
    * */
    private static String reverseSentence(String sentence) {
        StringBuilder string = new StringBuilder(sentence);
        StringBuilder reversedSentence = new StringBuilder();
        Stack<Character> stck = new Stack<>();
        System.out.println(string.reverse());
        for (int i = 0; i < string.length(); i++) {
            if ((string.charAt(i) != ' ')) {
                stck.push(string.charAt(i));
            } else {
                //pop the entire stack
                while (!stck.empty()) {
                    reversedSentence.append(stck.pop());
                }
                reversedSentence.append(' ');
            }
        }
        while (!stck.empty()) {
            reversedSentence.append(stck.pop());
        }
        return reversedSentence.toString();
    }

    public static void main(String[] args) {
        // System.out.println(isUniqueChars("WorldW"));
        // System.out.println(isPermutable("dog", "god"));
        // System.out.println(urlify("Mr John Smith    ", 13));
        // permute("aabc");
        // compression("aabccccccaaa");
        // System.out.println(oneAway("pale", "bale"));
        System.out.println(reverseSentence("ram is costly and runtime is O(n)^2"));
    }

}
