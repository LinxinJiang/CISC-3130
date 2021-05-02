public class InsertionSort {


    public static void main(String[] args) {
        int[] array = {432,-2,45,565,22,57,-67,27,64,23,23};

        System.out.println("Insertion Sort");

        printArray(array);

        System.out.println("\n");

        insertionSort(array);

        printArray(array);

        System.out.println("\n");

        /**
         *  Print Out:
         *
         *  432 2 45 565 22 57 67 27 64 23 23
         *
         *  2 22 23 23 27 45 57 64 67 432 565
         *
         */


    }


    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }


    public static void insertionSort(int[] array){

        // start from 1, because index 0 already in order

        for(int i = 1; i< array.length; i++){

            // the value
            int key = array[i];

            // start from here to compare with key
            int j = i-1;

            while(j >= 0 && array[j] > key){
                // move the array[j]
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = key;
        }

    }


}
