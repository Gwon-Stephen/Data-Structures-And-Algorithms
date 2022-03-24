public class Chapter07_Big_O_In_Everyday_Code{
    /*
    Real World Examples:
        Mean average of even numbers
            steps is O(3N+3)
            notation: O(N)
        Word Builder
            the speed goes up one exponent per letter added to array
            with two letter arrays, speed is O(N^2)
            with three letter arrays, speed is O(N^3)
        Array Sample
            O(1)
            1 step
        Average Celsius Rating
            steps is O(2N)
            notation: O(N)
        Clothing Labels
            O(N) because nested for loop always runes 5 times no matter what the N value is
        Count The Ones
            O(N) because the nested loops are iterating over two different things
        Palindrome Checker
            steps is O(N/2)
            notation: O(N)
        Get All The Products
            O(N^2) because the nested loops are iterating over the same array
        Password Cracker
            because the alphabet has 26 letters, this notation is O(26^N)
            brute force is so inefficient because one element doubles steps, super slow

    Dealing With Multiple Datasets
        -what happens when instead of computing the product of every two numbers from one array, we compute the product of every num from one array to a second array?
        -if we count N as elements in first array and M as elements in second array, we can denote the steps as O(N*M)
        -If N elements is the same as M elements, then notation is O(N^2)
        -If M is a smaller number, then notation is O(N)

    EXERCISES:
        1. Describe time complexity
            there is only one loop, so O(N)
        2. Describe time complexity
            one loop, so O(N)
        3. Describe time complexity
            in between O(N) and O(N^2) based on how short the needle array is O(N*M)
        4. Describe time complexity
            three nested loops, O(N^3)
        5. Describe time complexity
            one loop getting rid of half of the elements, so O(log N)
     */

}
