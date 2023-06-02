package string_problems;

import math_problems.PrimeNumber;

public class Permutation {

    /** INSTRUCTIONS
     * Create a Java program to compute all permutations of any given string
     *
     * e.g. -  "ABC" = "ABC" "ACB" "BAC" "BCA" "CAB" "CBA"
     */

    static void printDistinctString(String input, String result) {
        if (input.length() == 0) {
            System.out.println(result + " ");
            return;
        }
        boolean alphabet[] = new boolean[20];
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String restvalue = input.substring(0, i) + input.substring(i + 1);
            if (alphabet[ch - 'a'] == false) ;
            printDistinctString(restvalue, result + ch);
            alphabet[ch - 'a'] = true;
        }
    }
        public static void main(String[] args){
         String St="fatma";
        printDistinctString(St," ");



        }
    }







