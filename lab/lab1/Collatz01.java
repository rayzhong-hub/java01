/**
 * Collatz sequence: if n is even, the next number is n/2. If n is odd, the next number is 3n + 1. If n is 1, the sequence is over
 * first task: public static int nextNumber(int n) method that returns the next number
 * second task: in the main method print out the sequence starting at 5 (n = 5)
 */


public class Collatz01{

    public static int nextNumber (int n){
        if (n % 2 == 0){
            return n/2;
        }
        else{
            return 3*n + 1;
        }
    }

    public static void main(String[] args){
        int n = 5;
        System.out.print(n + " ");

        while( n!=1){
            n = nextNumber(n);
            System.out.print(n + " ");
        }

    }
}
