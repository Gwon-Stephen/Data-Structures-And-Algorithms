public class Chapter17_Tries {
    /*
    Tries
        tree ideal for text based features
        trie is not binary
        create words getting letters down individual nodes
        * with null value signifies end
        think of autocomplete

        Trie Search
            current node starts at root node
            iterate over each character in search string
            look to see if current node has a child with that character as a key
            if not, return none
            else update the current node to become that child
            repeat until we get to end of search string
            O(K) efficiency, k = # of characters in string

        Trie Insertion
            current node starts at root node
            search
            if final character is found, add a * child to last node to indicate the word is complete

     */
}
