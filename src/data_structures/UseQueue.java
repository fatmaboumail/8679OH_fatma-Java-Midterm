package data_structures;

import java.util.PriorityQueue;

public class UseQueue {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use Queue that includes add, peek, remove & poll methods.
     * Use For-Each loop and While-Loop with Iterator to retrieve data.
     *
     * Store and retrieve data from/to a database table.
     */


    public static void main(String[] args) {
        PriorityQueue<String>pq =new PriorityQueue<>();
        pq.add("nor");
        pq.add("salah");
        pq.add("sara");
        pq.add("houria");
        System.out.println("preority queue content:"+ pq);
        System.out.println("head of queue:"+pq.peek());
        System.out.println("head remove:"+pq.poll());

    }

}
