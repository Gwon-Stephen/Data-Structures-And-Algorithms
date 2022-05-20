public class Chapter11_Learning_To_Write_In_Recursive {
    /*
    -efficiency of recursion sucks lol

    Recursive Categories:
        Repeatedly Execute:
            the recursive line repeatedly executes something until the base case is met
            to keep track of more and more things, you can add more parameters
        Calculations:
            recursion allows you to find calculation based on a sub-problem of the problem at hand
            sub problem- version of the very same problem applied to a smaller input
            Top Down Recursion-
                imagine the function you're writing has already been implemented by someone else
                identify the sub problem of the problem
                see what happens when function is calls on the sub problem
            O(N!) => factorial time, slowest category of big O

        Staircase Problem:
            Staircase with N steps, and a person has teh ability to climb one, two, or three steps. how many different possible paths can someone take to the top?
            Write a function that will calculate this in N steps
            to recursively write this, you just add the number of steps it takes for n-1,2, and 3.

        Anagram Generation:
             Write a function that return an array of all anagrams of a given string.
             Recursive, top down approach using substrings would probably be most efficient
             O(N!) efficiency because each additional element added onto the string would result in s.length + 1 more anagrams




     */

    //Staircase Problem Implemented
    public static int numPaths(int n)
    {
        if(n <= 0)
            return 0;
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
        if(n == 3)
            return 3;
        return numPaths(n-1) + numPaths(n-2) + numPaths(n-3);
    }

    public static void main(String[] args)
    {
        System.out.println(numPaths(5));
    }

}
