public class Why_Data_Structures_Matter {
    /*
    Why does this all matter?
        Code Quality
            -Maintainability
                -readability
                -organization
                -modularity
            -Efficiency
                -speed

        Data is all types of info
        Data structures refer to how data is organized

    ARRAYS:
        size vs index. size is amount of elements, index is place of element starting at 0
        Data Structure Operations:
            Read- looking for index where value exists
                -takes one step
            Search- looking for value in data structure
                -takes n steps
            Insert- add new value
                -takes 1 ~ n+1 steps
            Delete- remove value
                -takes n steps

    SETS:
        a set is a data structure that doesn't allow duplicate values
        insertion in a set
            -takes n+1 ~ 2n+1 steps
    */

    /*
    Exercises:

    1. For an array containing 100 elements, provide the number of steps the following operations would take:
        a)Reading
            array, so one step
        b)Searching for a value not contained within the array
            n steps, where n = 100
        c)Insertion at the beginning of the array
            array, so 101 steps
        d)Insertion at end of array
            array, so 1 step
        e)Deletion at beginning of array
            array, so n steps, where n = 100
        f)Deletion at the end of the array
            array, so one step

    2. For an array-based set containing 100 elements, provide the number of steps the following operations would take:
        a)Reading
            one step
        b)Searching for a value not contained within the array
            n steps, where n = 100
        c)Insertion at the beginning of the array
            set, so it takes 2n+1 steps, where n = 100
        d)Insertion at end of array
            set, so it takes n+1 steps, where n = 100
        e)Deletion at beginning of array
            n+1 steps, where n = 100
        f)Deletion at the end of the array
            1 step

   3. Normally the search operation in an array looks for the first instance of a given value.
      But sometimes we may want to look for every instance of a given value. For example, say we want to count how many times
      the value "apple" is found inside an array. How many steps would it take to find all the "apples"? Give your answer in terms of N.

      N steps, because we cannot just exit out once we find one instance. very similar to searching n steps

    */
}
