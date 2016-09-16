package bitManipulation;

import java.math.BigDecimal;

public class bitManipulation {
    public static void main(String[] args) {
        int num1 = 10; // takes 4 byte or 32 bits
        int num2 = 5; // takes 4 byte or 32 bits
        System.out.println(Integer.toBinaryString(num1)); // 1010
        System.out.println(Integer.toBinaryString(num2));
        System.out.println(num1 | num2); // 10 | 5 => 15
        System.out.println(num1 & num2); // 10 & 5 => 0
        System.out.println(num1 ^ num2); // 10 ^ 5 => 15

        System.out.println(~num1);
        /*5 => 1010
        * [0]000....1010 1st bit is the sign bit / significant bit and rest 31 bits represent values.
        * take the negation of 4
        * [1]111...0101
        * take 2's complement of the 31 bits
        * [1]000...1010
         * add 1
         * [1]000...1011 => 8+ 2+ 1 => 11=> -11*/
        byte a = 10;
        a = (byte) (a + 1);
        // a++;
        System.out.println("value of a " + a);
        BigDecimal bigDecimal = new BigDecimal("10202003.12312323");
        BigDecimal bigDecimal2 = new BigDecimal("10202003.12312323");
        BigDecimal bigDecimal3 = bigDecimal.add(bigDecimal2);
        System.out.println(bigDecimal3);
    }
}
