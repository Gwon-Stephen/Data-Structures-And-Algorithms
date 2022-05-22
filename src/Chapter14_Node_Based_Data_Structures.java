import java.util.*;

public class Chapter14_Node_Based_Data_Structures {
    /*
    Node- piece of data that may be dispersed throughout the computer's memory
        used to organize and access data

    Linked Lists:
        represents a list of items
        the data in the node links to the next node's memory address
        head and tail
        null at tail signals end of linked list
        only the first node is accessible immediately
        reading and searching from a linked list takes O(N) efficiency
        insertion and deletion takes O(1)-O(N) efficiency
        arrays have an easier time at end while linked lists have easier time in beginning
        better at inserting and deleting through all elements

    Doubly Linked Lists:
        each node has two links, one pointing to next node and other pointing to previous node
        keeps track of both first and last nodes
        perfect data structure for a queue

     */

    //implementing linked list
    public static void main(String args[])
    {

        LinkedList<String> ll = new LinkedList<String>();

        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");

        System.out.println(ll);

        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
