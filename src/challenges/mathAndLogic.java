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

    public static void main(String[] args) {
        int n = (int) Math.sqrt(21);
        System.out.println(n);
        System.out.println(isPrime(81));
        System.out.println(isPrimeModern(81));

    }
}
