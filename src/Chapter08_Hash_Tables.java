public class Chapter08_Hash_Tables {
    /*
    Hash Tables:
        -super fast reading with usually O(1) time complexity
        -other names: dictionaries, hash maps, hashes, maps, associative arrays
        -contains list of paired values, first is a key, second is a value
            -each value is stored at the index of the key after it has been hashed
        -hashing: converting characters into numbers
        -code used to convert those letters into numbers is called a hash function
        *only one criteria needed: a hash function must convert the same string to the same number every single time it's applied
            -each key can exist only once in hash table, but there can be multiple instances of a value

    Collisions:
        -collisions: trying to add data to a cell that is already filled
        -solution: separate chaining, which instead of placing a single value in a cell, it places in it a reference to an array
            -moves to index of key, and then linearly searches it for the value associated with the key
            -worst case results in O(N)

    The Great Balancing Act:
        -A good has table balances avoiding collisions while not consuming lots of memory
            -too much data into too few cells will result in collision and slow down efficiency
            -too many cells will result in memory hogging
        *For every 7 data elements, you want 10 cells.
            -ratio of data to cells is called the load factor. Ideal load factor is .7
     */

    //EXERCISES:
    //1. write a function that returns the intersection of two arrays. The intersection is a third array that contains all values contained within the first two. O(N) complexity
    //2. write a function that accepts an array of strings and returns the first duplicate it finds. O(N) complexity
    //3. write a function that accepts a string that contains all the letter of the alphabet except one and returns the missing letter. O(N) complexity
    //4. write a function that returns the first non-duplicated character in a string. O(N) complexity

}
