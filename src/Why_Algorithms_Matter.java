public class Why_Algorithms_Matter {
     /*
    Algorithm: a set of instructions for completing a specific task.

    Ordered Arrays:
        -values kept in order
        -insertion takes N+2 steps, N+1 at the end
        -linear search
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

    public static void main(String[] args)
    {
        int[] orderedArray = {0, 15, 24, 49, 92, 100};

        System.out.println(linear_search(orderedArray, 92));
        System.out.println(linear_search(orderedArray, 15));
        System.out.println(linear_search(orderedArray, 80));
    }
}