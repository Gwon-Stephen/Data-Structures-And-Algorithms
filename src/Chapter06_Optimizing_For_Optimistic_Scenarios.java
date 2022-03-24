import java.util.Arrays;

public class Chapter06_Optimizing_For_Optimistic_Scenarios {
    /*
    Insertion Sort:
        -remove the value at index 1,2,3, etc. and set that to a temp variable
        -take each value to the left, if the value is greater than the temp variable, shift value to the right
        -ends when we find value that is lower than temp variable or as we reach the left end of the array
        -steps: removals, comparisons, shifts, and insertions
        *Big O Notation only takes into account the highest order of N when we have multiple orders added together
        -best sorting method so far regarding average case

    Average Case Scenario:
        -cases that occur most frequently
        -avg case in insertion sort is shifting about half the data
            best case: [1,2,3,4]
            worst case: [4,3,2,1]
            avg case: [1,3,4,2]

    EXERCISES:
        1. Big O Notation for algorithm that takes 3N^2 + 2N + 1 steps
            O(N^2)
        2. Big O Notation for algorithm that takes N + log N steps
            O(N)
        3. give best, avg, and worst case scenarios.
            Best: two numbers from start add up to 10
            Avg:  two number in middle add up to 10
            Worst: two number at end add up to 10 O(N^2)
        4. give time complexity and improve algorithm's efficiency for best and avg case
            return true AS SOON AS "X" is found.
     */

    //implementing insertion sort
    public static int[] insertionSort(int[] array)
    {
        for(int i = 1; i < array.length; i++)
        {
            int temp = array[i];
            int position = i - 1;

            while(position >= 0)
            {
                if(array[position] > temp)
                {
                    array[position+1] = array[position];
                    position = position - 1;
                } else
                    break;
            }
            array[position+1] = temp;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] unsortedArray = {0, 24, 83, 35, 100, 62, 70, 15, 92, 49};
        System.out.println(Arrays.toString(insertionSort(unsortedArray)));
    }
}
