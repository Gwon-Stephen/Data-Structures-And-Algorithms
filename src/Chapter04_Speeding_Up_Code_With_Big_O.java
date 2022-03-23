import java.util.Arrays;

public class Chapter04_Speeding_Up_Code_With_Big_O {
    /*
    essence of sorting: "Given an array of unsorted values, how can we sort them so that they end up in ascending order?"

    Bubble Sort:
        -simple sort that compares to number in an array, and the highest unsorted value "bubbles" up to the correct position
        -two kinds of steps needed: comparisons and swaps
            -as the number of elements increases, the number of steps grows exponentially as two kinds of steps are increasing
            -therefore, time complexity is O(N^2) -> quadratic time

    Time Complexity Problems:
        -nested loops usually create O(N^2) time complexities
        -by only using one loop, the time complexity is now shrunken to O(N)

        -with two approaches O(N^2) and O(N) regarding loops, O(N) runs more efficiently but consumes more memory while O(N^2) is the opposite

    EXERCISES:
        1. N Elements | O(N) | O(log N) | O(N^2)
             100        100       7       10000
             2000       2000      11     4000000
        2. if O(N^2) algorithm takes 256 steps, what is the size of the array?
                size 16
        3. Give time complexity:
                O(N^2) because there are is a nested for loop
        4. Write a function that find the greatest single number within an array, but has an efficiency of O(N^2).
           Rewrite the function so it becomes a speedy O(N)
                coded below!

     */

    //4. O(N^2)
    public static int greatestNum(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            boolean isGreatest = true;
            for(int j = 0; j < array.length; j++)
            {
                if(array[j] > array[i])
                    isGreatest = false;
            }
            if(isGreatest)
                return i;
        }

        return -1;
    }

    //4. O(N)
    public static int greatestNum2(int[] array)
    {
        int max = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > array[max])
                max = i;
        }

        return max;
    }


    //implementing bubble sort
    public static int[] bubbleSort(int[] array)
    {
        int unsortedNum = array.length-1;
        boolean sorted = false;

        while(!sorted) {
            sorted = true;
            for (int i = 0; i < unsortedNum; i++) {
                if(array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
            unsortedNum -= 1;
        }

        return array;
    }

    public static void main(String[] args)
    {
        int[] unsortedArray = {0, 24, 83, 35, 100, 62, 70, 15, 92, 49};
        System.out.println(greatestNum(unsortedArray));
        System.out.println(greatestNum2(unsortedArray));
        System.out.println(Arrays.toString(bubbleSort(unsortedArray)));

    }

}
