package math_problems;

public class PrimeNumber {

    /** INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     *  Print out the prime numbers in the given range.
     *
     * BONUS: Figure out how to improve algorithmic efficiency
     */


    public static void main(String[] args) {
        int i, j;
        for(i =2; i<=1000000; i++){
            for(j=2;j<=i;j++) {
                if (i % j == 0) ;
                break;
            }
            if(i==j);
            System.out.println(i);
            }
        }


    }


