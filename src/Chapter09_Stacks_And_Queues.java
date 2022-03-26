import java.util.Stack;

public class Chapter09_Stacks_And_Queues {
    /*
     stacks and queues are simple arrays with restrictions

     STACKS:
        -data can be inserted only at the end of the stack
            -insert: push
        -data can be deleted only from the end of the stack
            -delete: pop
        -only the last element of a stack can be read
            -think dishes: last in, first out (LIFO)
        -abstract data type, meaning it's a data structure that has set of rules revolving around another data structure
        -one example of a stack is a code linter, making sure your brackets, parentheses, etc. are always closed

    QUEUES:
        -data can be inserted only at the end of the queue
            -end: back
        -data can be deleted only at the front of the queue
            -beginning: front
        -only element at front of queue can be read
        -only first element of a stack can be read
            -think line for a movie, first in, first out (FIFO)
        -abstract data type

    The Importance of Constrained Data Structures:
        -it forces a rule, preventing bugs
        -new mental model for tackling problems
        -familiar and elegant to others
        -these are the foundations of recursion
    EXERCISES:
        1. If you were writing software for a call center that places callers on hold and then assigns them to "the next available representative," would you use a stack or a queue?
            queue
        2. If you pushed numbers onto a stack in the following order: 1,2,3,4,5,6 and then popped two items, which number would you be able to read from the stack?
            4
        3. If you inserted numbers into a queue in the following order: 1,2,3,4,5,6 and then dequeued two items, which number would you be able to read from the queue?
            3
        4. Write a function that uses a stack to reverse a string.
     */

    //exercise 4
    public static String reverse(String s)
    {
        Stack<String> stack = new Stack<>();

        String answer = "";

        for(int i = 0; i < s.length(); i++)
        {
            stack.push(Character.toString(s.charAt(i)));
        }

        for(int i = 0; i < s.length(); i++)
        {
            answer += stack.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        String greeting = "hello my name is stephen";
        System.out.println(reverse(greeting));
    }
}
