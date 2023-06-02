package string_problems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    /** INSTRUCTIONS
     * Write a java program to find duplicate words and the number of occurrences of those words in the given string.
     * Also, find the average length of all the words
     */

    public static void main(String[] args) {
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        String[] s= st.split(" ");
        Map<String,Integer> map=new HashMap< String, Integer>();
        for (String str: s){
            Integer old = map.get(str);
            if(old==null){
                old =0;
            }
            map.put(st,old+1);
        }
        System.out.println(map);




    }

}
