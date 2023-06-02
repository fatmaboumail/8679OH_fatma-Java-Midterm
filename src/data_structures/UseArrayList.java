package data_structures;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    /**
     * INSTRUCTIONS
     * <p>
     * Demonstrate how to use an ArrayList that includes using the add, peek, remove & retrieve methods.
     * Use For-Each loop and While-loop with Iterator to retrieve the data.
     * <p>
     * Store and retrieve the data from/to a database table.
     */

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("bananas");
        fruits.add("appel");
        fruits.add("strawberry");
        fruits.add("kiwis");
        fruits.remove("bananas");


        System.out.println("for loop");
        for (int i=0; i< fruits.size();i++){
            System.out.println(fruits.get(i)+ " ");
        }

        System.out.println("\n\n iterator");
        Iterator<String> iterator= fruits.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }

    }






    }










