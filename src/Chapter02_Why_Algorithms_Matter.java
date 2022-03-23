public class Chapter02_Why_Algorithms_Matter {
     /*
    Algorithm: a set of instructions for completing a specific task.

    Ordered Arrays:
        -values kept in order
        -insertion takes N+2 steps, N+1 at the end
        -linear search
        -binary search: much faster
            picks a value. if higher, all lower elements deleted. keep going until number is found
            time complexity is logarithmic-like. When elements in array are doubled, search takes one more step
        -summary: ordered arrays take more time to insert, but way less to search

    EXERCISES:
        1. How many steps would it take to perform a linear search for the number 8 in an ordered array, [2,4,6,8,10,12,13]?
            4
        2. How many steps would binary search take for the previous example?
            1
        3. what is the maximum number of steps it would take to perform a binary search on an array of size 100,000?
            keep dividing 100,000 by two, upon repeating 16 times, we get a fraction, so 16 steps.

     */


    //implementing linear search on ordered array
    public static int linear_search(int[] array, int value)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == value)
                return i;
            else if(array[i] > value)
                break;
        }

        return -1;
    }

    //implementing binary search on ordered array
    public static int binary_search(int[] array, int value)
    {
        int lowerBound = 0;
        int upperBound = array.length - 1;
        int midpoint;


        while(lowerBound <= upperBound)
        {
               midpoint = (upperBound + lowerBound) / 2;
               if(value == array[midpoint])
                   return midpoint;
               else if(value < array[midpoint])
                   upperBound = midpoint - 1;
               else if(value > array[midpoint])
                   lowerBound = midpoint + 1;
        }

        return -1;
    }

    public static void main(String[] args)
    {
        int[] orderedArray = {0, 15, 24, 35, 49, 62, 70, 83, 92, 100};

        System.out.println(linear_search(orderedArray, 92));
        System.out.println(linear_search(orderedArray, 15));
        System.out.println(linear_search(orderedArray, 80));

        System.out.println(binary_search(orderedArray, 92));
        System.out.println(binary_search(orderedArray, 15));
        System.out.println(binary_search(orderedArray, 80));
    }
}