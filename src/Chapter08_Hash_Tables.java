import java.util.Arrays;
import java.util.Hashtable;

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
    public static int[] intersection(int[] array1, int[] array2)
    {

        Hashtable<Integer, Integer> hash = new Hashtable<>();
        int count = 0;
        int index = 0;

        for(int i = 0; i < array1.length; i++) {
            hash.put(i, array1[i]);
        }

        for(int k = 0; k < array2.length; k++)
        {
            if(hash.contains(array2[k]))
            {
                count++;
            }

        }

        int[] answer = new int[count];

        for(int j = 0; j < array2.length; j++)
        {
            if(hash.contains(array2[j]))
            {
                answer[index] = (array2[j]);
                index++;
            }

        }

        return answer;
    }

    //2. write a function that accepts an array of strings and returns the first duplicate it finds. O(N) complexity
    public static String duplicate(String[] a1)
    {
        Hashtable<Integer, String> hash = new Hashtable<>();

        for(int i = 0; i < a1.length; i++)
        {
            if(hash.contains(a1[i]))
            {
                return a1[i];
            } else
                hash.put(i, a1[i]);
        }

        return "no duplicates";
    }

    //3. write a function that accepts a string that contains all the letter of the alphabet except one and returns the missing letter. O(N) complexity

    public static char missingLetter(String word)
    {
        Hashtable<Integer, Character> hash = new Hashtable<>();

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for(int i = 0; i < word.length(); i++)
        {
            hash.put(i, word.charAt(i));
        }

        for(int j = 0; j < alphabet.length(); j++)
        {
            if(!hash.contains(alphabet.charAt(j)))
                return alphabet.charAt(j);
        }

        return '0';

    }
    //4. write a function that returns the first non-duplicated character in a string. O(N) complexity

    public static String nonDuplicate(String[] ar)
    {
        Hashtable<String, Integer> hash = new Hashtable<>();
        for(int i = 0; i < ar.length; i++)
        {
            if(hash.containsKey(ar[i]))
            {
                hash.put(ar[i], hash.get(ar[i]) + 1);
            } else {
                hash.put(ar[i], 0);
            }
        }

        for(int i = 0; i < ar.length; i++)
        {
            if(hash.get(ar[i]) == 0)
                return ar[i];
        }
        return null;
    }

    public static void main(String[] args) {
        int[] array1 = {0,1,2,3,4,5,6,7,8,9,10,15,20,30};
        int[] array2 = {1,2,3,5,6,8,10,11,15};

        String word = "the quick brown box jumps over a lazy dog";

        String[] duplicateTest = {"a", "b", "c", "d", "d", "e", "f"};

        System.out.println(Arrays.toString(intersection(array1,array2)));
        System.out.println(duplicate(duplicateTest));
        System.out.println(missingLetter(word));
    }
}
