/*
* Example of
*     #
*    ##
*   ###
*  ####
* #####
* */
package challenges;
import java.util.*;
public class staicase{
        /*
    * Example :
    * students
    *        s
    *        t
    *        a
    *        i
    *        r
    *        saurabh
                   t
                   o
                   m
    */

    // public static void demo(String[] n) {
    //     boolean even = true;
    //
    //     for (int i = 0; i < n.length; i++) {
    //         if (even) {
    //             System.out.println(n[i]);
    //             even = false;
    //             int len =
    //         } else {
    //             for (int j = 0; j < n[i].length(); j++) {
    //                 System.out.println(n[i].charAt(j));
    //             }
    //             even = true;
    //         }
    //     }

    /*
* 6, PAYPALISHIRING
*1 P    R
*2 A   II
*3 Y  H N
*4 P S  G
*5 AI
*6 L*/
    static String func(int numRows, String s) {
        // String[][] matrix = new String[n][str.length() / 2];
        // if (str.length() < 2)
        int len = 0;
        if (numRows < 2) {
            return s;
        }
        if (s.length() % 2 == 0) {
            len = s.length()/2;
        } else {
            len = s.length()/2 + 1;
        }
        Character[][] matrix = new Character[numRows][len];
        //make a queue of the string : First In First Out
        Queue<Character> que = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            que.add(s.charAt(i));
        }

        boolean diagonal = false;
        int diagonalCounter = 0;
        for (int j = 0; j < len; j++) {
            for (int i = 0; i < matrix.length; i++) {
                // matrix[i][j] = que.remove();
                if (i == matrix.length - 1 && !diagonal && !que.isEmpty()) { // 5
                    matrix[i][j] = que.remove();
                    diagonal = true;
                    diagonalCounter = matrix.length - 2;

                } else if(i == 0 && diagonalCounter == 0 && !que.isEmpty()){
                    diagonal = false;
                    diagonalCounter = 0;
                    matrix[i][j] = que.remove();
                    // System.out.println(matrix[i][j]);
                } else if (diagonal && diagonalCounter == i && !que.isEmpty()) {
                    matrix[i][j] = que.remove();
                    diagonalCounter--;
                }
                else if (!diagonal && !que.isEmpty()) { // diagnoal false, add elements straight
                    matrix[i][j] = que.remove();
                // } else if (diagonal){
                //     matrix[i][j] = ' ';
                } else {
                    matrix[i][j] = ' ';
                }
            }
            }

        //print the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                }
            System.out.println();
            }
        System.out.println();

        //build the string
        StringBuilder strBuild = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(!(matrix[i][j] == ' '))
                    strBuild.append(matrix[i][j]);
            }
        }

        return strBuild.toString();
        }

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
        // printStaircase(n);

        // String[] str = {"students", "stairs", "saurabh", "tom"};
        // demo(str);
        String str = "hpangeiugensdhgpgcnrfnbqsktkdogndjalniftmvnrcuikyvbdkeueqnoubxhgghrvrzofueyyagiydlbppvuik";
        int n = 10;
        printStaircase(n);
        System.out.println();
        System.out.println("String length : " + str.length());
        System.out.println("matrix width : " + ((str.length()/2)));
        System.out.println(func(n, str));
    }
}



