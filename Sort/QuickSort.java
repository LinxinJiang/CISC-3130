public class QuickSort {

    public static void main(String[] args) {

        int[] array = {64, 25, -12, 22,432,2,45,-565,22,57,67};

        System.out.println("Quick Sort");

        printArray(array);

        System.out.println("\n");


        System.out.println("After: ");


        // sort
        quickSort(array);

        printArray(array);

        System.out.println("\n");



    }

    // call this
    public static void quickSort(int[] array) {
        // call quick();
        quick(array,0,array.length-1);
    }



    public static void quick(int[] array, int left, int right) {

        if(left >= right){
            return;
        }

        int pivot = array[(left + right)/2];

        int index = partition(array,left,right,pivot);

        quick(array,left,index-1);
        quick(array,index,right);
    }

    public static int partition(int[] array,int left, int right,int pivot){

        while(left <= right){
            while (array[left] < pivot){
                left++;
            }

            while (array[right] > pivot){
                right--;
            }

            if(left <= right){
                swap(array,left, right);
                left++;
                right--;
            }
        }

        return left;
    }

    public static void swap(int[] array,int i1, int i2){
        int temp = array[i1];
        array[i1] = array[i2];
        array[i2]= temp;
    }




    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
