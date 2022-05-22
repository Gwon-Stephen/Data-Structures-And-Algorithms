public class Chapter15_Binary_Search_Trees {
    /*
    Trees:
        each node can have links to multiple nodes
        uppermost node = root
        nodes can have descendants and ancestors
            parent and children
        levels are a row within the tree
        balance vs imbalance of nodes

    Binary Search Trees:
        binary tree- 0, 1, or 2 children
        binary search tree-
            each node can have at most one left and right child
            a node's left descendants can only contain values that are less than the node itself. right descendants can only contain values greater
            if there are N nodes in a balanced binary tree, there are about log N levels


    Searching:
        designate a node to current (usually root)
        inspect value at node
        if our value = node value, done
        if our value < node value go left
        if value > node value go right
        repeat until found or value is not found at bottom level
        O(log N) if perfectly balanced

    Insertion:
        start at root
        repeat searching algorithm
        when reaching a node that has no children, insert
        O(log N) efficiency

    Deletion:
        if node is being deleted without children, delete it
        if node being deleted has one child, delete node and plug child into spot where node deleted
        if node being deleted has two children, replace deleted node with successor node (least of all values greater than the deleted node)
            to find successor node, visit right child, then keep visiting left child until no more. the bottom value is successor node
            if successor node has right child, turn it into the left child of the former parent of successor
        O(log N) efficiency

    Traversal
        inorder traversal
            call traverse recursively on left child
            then visit the node
            the call itself recursively on the node's right child
            base case: traversing on child that doesn't exist
            O(N) efficiency
     */

    class Node {
        int key;
        Node left, right;

        public Node(int data){
            key = data;
            left = right = null;
        }
    }

    //searching
    public Node search(Node root, int key)
    {
        // Base Cases: root is null or key is present at root
        if (root==null || root.key==key)
            return root;

        // Key is greater than root's key
        if (root.key < key)
            return search(root.right, key);

        // Key is smaller than root's key
        return search(root.left, key);
    }

    //insert
    Node insert_Recursive(Node root, int key) {
        //tree is empty
        if (root == null) {
            root = new Node(key);
            return root;
        }
        //traverse the tree
        if (key < root.key)     //insert in the left subtree
            root.left = insert_Recursive(root.left, key);
        else if (key > root.key)    //insert in the right subtree
            root.right = insert_Recursive(root.right, key);
        // return pointer
        return root;
    }

    //delete
    Node delete_Recursive(Node root, int key)  {
        //tree is empty
        if (root == null)  return root;

        //traverse the tree
        if (key < root.key)     //traverse left subtree
            root.left = delete_Recursive(root.left, key);
        else if (key > root.key)  //traverse right subtree
            root.right = delete_Recursive(root.right, key);
        else  {
            // node contains only one child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // node has two children;
            //get inorder successor (min value in the right subtree)
            root.key = minValue(root.right);

            // Delete the inorder successor
            root.right = delete_Recursive(root.right, root.key);
        }
        return root;
    }
    int minValue(Node root)  {
        //initially minval = root
        int minval = root.key;
        //find minval
        while (root.left != null)  {
            minval = root.left.key;
            root = root.left;
        }
        return minval;
    }


    //traverse
    void inorder_Recursive(Node root) {
        if (root != null) {
            inorder_Recursive(root.left);
            System.out.print(root.key + " ");
            inorder_Recursive(root.right);
        }
    }
}
