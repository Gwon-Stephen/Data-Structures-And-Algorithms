public class Chapter10_Recursion {
    /*
    RECURSION:
        -base case: the case in which our function will not recurse
            -need at least one to stop function from running indefinitely
        -call stack: stack to keep track of functions in the middle of calling
            -the top element will be the most recently called function
        -stack overflow: recursion shutting down due to no more short term memory

    EXERCISES:
        1. return base case
            if( low > high)
                return low;
        2. predict what will happen when we run factorial(10) using recursive factorial function but it computes factorial based on (n - 2) instead of (n - 1)
            prints out 10*8*6*4*2*0*-2... it will infinitely recurse
        3. add base case to a function in which we pass in two numbers called low and high. the function returns the sum of all the numbers from low to high.
            if(low == high)
                return low;
        4. write a recursive function that prints out all the numbers from multiple arrays in arrays
            for value in array, if value = list, recurse. else, print(value);
            idk how to do this in java
     */

}
