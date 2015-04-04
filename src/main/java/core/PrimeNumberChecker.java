package core;

public class PrimeNumberChecker {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public boolean isPrime(final int inputNum) {

        int num = Math.abs(inputNum);
        if(num < 2)  // 0 and 1 are not prime
            return false;
        // 2 is prime
        // 3 is prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
