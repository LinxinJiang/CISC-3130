public class MergeSort {


    public static void main(String[] args) {

        int[] array = {64, 25, -12, 22,432,-2,450,565,22,57,67};

        System.out.println("Merge Sort");

        printArray(array);

        System.out.println("\n");


        System.out.println("After: ");


        // sort

        sort(array, 0, array.length - 1);

        printArray(array);

        System.out.println("\n");

    }

    public static void sort(int arr[], int l, int r){
        if (l < r) {
            // middle point
            int m =l+ (r-l)/2;

            // sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // merge
            merge(arr, l, m, r);
        }
    }

    public static void merge(int arr[], int left, int middle, int right) {
        int num1 = middle - left + 1;
        int num2 = right - middle;


        int L[] = new int[num1];
        int R[] = new int[num2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < num1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < num2; ++j)
            R[j] = arr[middle + 1 + j];


        int i = 0, j = 0;


        int k = left;
        while (i < num1 && j < num2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }


        while (i < num1) {
            arr[k] = L[i];
            i++;
            k++;
        }


        while (j < num2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }



    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

}
