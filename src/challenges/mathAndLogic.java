package challenges;

public class mathAndLogic {


    /*
    * Program to find if the number is prime or not.
    * RETURN true if the number is prime, false otherwise
    * */
    private static boolean isPrime(int n) {
        if (n < 2) {
            return false; // neither prime nor composite
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true; // if all the conditions to prove the number is a composite fails.
    }

    private static boolean isPrimeModern(int n) {

        if (n < 2) {
            return false; // neither true nor false
        } else {
            int num = (int) Math.sqrt(n);
            System.out.println("Square root of the num : " + num);
            for (int i = 2; i < num; i++) {
                if (n % i == 0) {
                    return false;
                }

            }
        }
        return true; // if prime
    }

    /*
    * function to print prime numbers from 1 to 100
    * */
    static void primetill100() {
        //catching the prime numbers from 1 to 100
        int n = 100;
        for(int i = 2; i < 100; i++) {
            for (int j = i+1; j < 100; j++) {
                if (i % j == 0) {
                    System.out.print(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = (int) Math.sqrt(21);
        System.out.println(n);
        System.out.println(isPrime(81));
        System.out.println(isPrimeModern(81));
        primetill100();
    }
}
