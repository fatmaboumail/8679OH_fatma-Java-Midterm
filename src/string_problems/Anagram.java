package string_problems;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.util.Arrays;

public class Anagram {


    /** INSTRUCTIONS
     * Write a Java Program, `isAnagram`, to check if any two strings are anagrams
     *
     *  An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
     *  original letters exactly once.
     *
     *         Ex: "CAT" & "ACT",
     *             "ARMY" & "MARY",
     *             "FART" & "RAFT"
     */
    public static void main(String[] args){
        String str1 ="CAT";
        String str2 ="ACT";
        System.out.println("both string are anagrams"+ anagramCheck (str1, str2));
    }
    public static boolean anagramCheck(String str1,String str2){
        char[] charArrayFromString1=str1.toCharArray();
        char[] charArrayFromString2=str2.toCharArray();
        Arrays.sort(charArrayFromString1);
        Arrays.sort(charArrayFromString2);
        return Arrays.equals(charArrayFromString1,charArrayFromString2);
    }





}
