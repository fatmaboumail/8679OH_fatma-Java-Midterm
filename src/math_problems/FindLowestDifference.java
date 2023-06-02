package math_problems;

public class FindLowestDifference {

    /** INSTRUCTIONS
     * Write a method to return the lowest number, that is not shared between the 2 arrays below
     * HINT: The lowest number that isn't shared between these arrays is 1
     */

    public static void main(String[] args) {


        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};

        int mindiff=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int min1=1;
        int min2=1;
        int n1= array1.length;
        int n2= array2.length;
        int diff=0;
        while (i<n1 && j<n2){
            diff=Math.abs(array1[i]-array2[j]);
            if (diff<mindiff){
                mindiff=diff;
            }
            if (array1[i]<array2[j]){
                i++;

            }
            else {
                j++;
            }
            System.out.println(min1+"and"+min2);
        }



        }






    }




