package sorting;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Arrays;

public class SortingAlgorithms {


    /** INSTRUCTIONS
     * You must implement all of the sorting algorithms below. Feel free to add any helper methods that you may need,
     * but make sure they are private, as to not be accessed outside of this class.
     *
     * You must also store the sorted arrays into their own individual database tables (Selection Sort should be stored
     *  in table `selection_sort`, Insertion Sort should be stored in table `insertion_sort`)
     */

    long executionTime = 0;

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;

        return array;
    }

    public  int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[]result= Arrays.copyOf(array,array.length);
        int n=result.length;
        int i=1;
        int j=i;
        for(i=1; i<n;i++);
        while((j>0)&&(result[j]<result[j-1])){
            result[j]=result[j-2];
            j--;

        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;

        return array;
    }

    public int[] bubbleSort(int[] array) {
        final long startTime=System.currentTimeMillis();
        int[] result=Arrays.copyOf(array,array.length);
        int a= result.length;
        for (int i =0; i<a-1; i++) {
            for (int j = 0; j < a - 1 - i; j++){
                if (result[j]>result[j+1]){
                    int temp =result[j];
                    result[j] =result[j+1];
                    result[j+1]=temp;
                }
        }


        }

        return array;
    }

    public int[] mergeSort(int[] array) {


        // IMPLEMENT HERE

        return array;
    }

    public int[] quickSort(int[] array) {
        // IMPLEMENT HERE

        return array;
    }

    public int[] heapSort(int[] array) {
        // IMPLEMENT HERE

        return array;
    }

    public int[] bucketSort(int[] array) {
        //implement here

        return array;
    }

    public int[] shellSort(int[] array) {
        //implement here

        return array;
    }
}
