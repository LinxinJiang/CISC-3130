

import java.util.ArrayList;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array = {64, 25, -12, 22,432,2,45,565,-22,57,67};

        System.out.println("Selection Sort");

        printArray(array);

        System.out.println("\n");


        System.out.println("After: ");
        selectionSort(array);

        printArray(array);

        System.out.println("\n");



    }


    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }


    public static void selectionSort(int[] array){

        // each round, find the smallest value
        // and exchange the number with the first number

         // record the min

        for(int i = 0; i < array.length-1; i++){

            // assume i is the smallest
            int min = i;

            for(int j = i + 1; j < array.length; j++){


                // if j smaller than min, then change min to j
                if(array[j] < array[min]){
                    min = j; // Index
                }

            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;


        }




    }




}
