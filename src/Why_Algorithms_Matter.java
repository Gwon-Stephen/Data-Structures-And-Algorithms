public class Why_Algorithms_Matter {
     /*
    Algorithm: a set of instructions for completing a specific task.

    Ordered Arrays:
        -values kept in order
        -insertion takes N+2 steps, N+1 at the end
        -linear search
        -binary search: much faster
            picks a value. if higher, all lower elements deleted. keep going until number is found

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
               else if(value > array[midpoint])
                   upperBound = midpoint - 1;
               else if(value < array[midpoint])
                   lowerBound = midpoint - 1;
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