package string_problems;

import java.util.Scanner;

public class Palindrome {

    /** INSTRUCTIONS
     * A palindrome is a word that can be reversed, and still remain the same.
     *
     * Example: MOM, DAD, MADAM, RACECAR
     *
     * Create a method to check if any given String is a palindrome or not.
     */

    public static void main(String[] args) {
        String str="madam";
        int start=0;
        int end=str.length() -1;
        boolean isPalindrome =true;
        while (start<end)
        {
            if (str.charAt(start)!=str.charAt(end)){
                isPalindrome= false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("not Palindorme");
        }
        }



    }




