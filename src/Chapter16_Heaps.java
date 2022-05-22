public class Chapter16_Heaps {
    /*
    Priority Queue
        only delete and access data from the front, but inserting makes sure the data remains sorted
        think of ER. severity first over order of arrival

    Heaps (Binary)
        Heap condition: value of each node must be greater than each of its descendant nodes
        The tree must be complete
            it must be full, but bottom row can have empty positions as long as there isn't any to the right of the node
        Weak order, weak searching, but this results in very fast insertions and deletions
        in priority queue, we always want to access greatest value, so we can look at the root of the heap
        Last node = rightmost node in its bottom level


    Insertion:
        Create a node and set it to the last node.
        compare the node with parent node
        if node > parent node, swap
            trickling
        repeat until parent > node then stop
        O(log N) efficiency

    Deletion:
        we only ever delete the root node
        move last node into where root was
        trickle the root down to proper place
            check both children of trickle node and see which is larger
            if trickle node is smaller than the larger of the two, swap trickle node with the larger child
            repeat until trickle node has no children who are greater
        O(log N) efficiency

    Problem of the Last Node
        completeness is necessary because then the heap remains well balanced
        to find last node, heaps are implemented using arrays
            last node always being the final element in the array
        by setting our heap to an array, we can also traverse the heap
            left = (index*2) + 1
            right = (index*2) + 2
            parent = (index-1) / 2
     */

    private int[] Heap;
    private int size;
    private int maxsize;

    //initializing heap
    public Chapter16_Heaps(int maxsize)
    {
        // This keyword refers to current instance itself
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize];
    }
}
