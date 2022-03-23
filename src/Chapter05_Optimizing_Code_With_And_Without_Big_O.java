import java.util.Arrays;

public class Chapter05_Optimizing_Code_With_And_Without_Big_O {
    /*
    Selection Sort:
        -searches through the array, keeping track of the lowest value
        -at the end, it swaps the value at index 0 with the lowest value
        -next iteration starts at the index 1
        -unlike bubble sort which has to make swaps every comparison, selection sort only makes one or zero swaps
        -time complexity: O(N^2), although selection sort is twice as fast
            *Big O Notation IGNORES constants
            -this is because Big O notation only considers the long term trajectory of the steps as data increases
            -O(N^2) will eventually become slower than O(N) multiplied by any factor

    EXERCISES:
        1. Use Big O Notation to describe the complexity of an algorithm that takes 4N + 16 steps
            O(N)
        2. Use Big O Notation to describe the complexity of an algorithm that takes 2N^2 steps
            O(N^2)
        3. Give time complexity
            O(N)
        4. Give time complexity
            O(N)
        5. Give time complexity
            O(N^2)
     */

    //implementing selection sort
    public static int[] selectionSort(int[] array)
    {
        for(int i = 0; i < array.length - 1; i++)
        {
            int lowestNumberIndex = i;
            for(int j = i + 1; j < array.length; j++)
            {
                if(array[j] < array[lowestNumberIndex])
                    lowestNumberIndex = j;
            }

            if(lowestNumberIndex != i)
            {
                int temp = array[i];
                array[i] = array[lowestNumberIndex];
                array[lowestNumberIndex] = temp;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[] unsortedArray = {0, 24, 83, 35, 100, 62, 70, 15, 92, 49};
        System.out.println(Arrays.toString(selectionSort(unsortedArray)));
    }
}
