import java.util.Arrays;

public class Chapter13_Recursive_Algorithms_For_Speed {
    /*
    Quicksort- currently fastest way of sorting array, uses partitioning
        To partition an array is to take a random value from the array, called a pivot and make sure that every number less than the pivot is on the left
        and every number greater than is on the right.

        Pointers: left and right most values of the array excluding pivot

        Left Pointer moves one cell right until it reaches value >= pivot
        Right pointer moves one cell left until it reaches value <= pivot
        if left pointer has reached or went beyond right, swap pivot with value of left pointer
        else swap values of left and right pointers and repeat

        O(NlogN) time complexity

    Quickselect-
        Select a value using a hybrid of quicksort
        You can find the correct value without having to sort the entire array
        O(N) efficiency






     */

    //Implementing quicksort
    public static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

    public static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    public static void main(String[] args)
    {
        int[] n = {1,3,6,89,4,67,3,8,45,0};

        quickSort(n,0,n.length-1);

        System.out.println(Arrays.toString(n));

    }

}


