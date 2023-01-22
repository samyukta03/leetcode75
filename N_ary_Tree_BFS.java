import java.util.*;
public class N_ary_Tree_BFS extends Node {
    /* -----------DIFF IN USING STACK & QUEUE
    * In a queue-based algorithm, the nodes are visited in a breadth-first order, while in a stack-based algorithm, the nodes are visited in a depth-first order.
    */ 
    public void preorder_Queue(Node root) {
        // Create an empty queue and empty list
        Queue<Node> queue = new LinkedList<Node>();
        // Add the root node to the queue
        queue.add(root);
        // Loop until the queue is empty
        while (!queue.isEmpty()) {
            // Remove the front node from the queue
            Node current = queue.poll();
            // Visit the removed node
            System.out.println(" "+current.val);
            // Add all the children of the removed node to the queue
            for (Node child : current.children) {
                queue.add(child);
            }
        }
    }
     // Function to perform level order traversal of an n-ary tree
     public List<Integer> preorder_Stack(Node root) {
        List<Integer> output = new ArrayList<Integer>();
         // Base case: if the tree is empty...
            if (root == null) return output;
        // Create an empty stack
        Stack<Node> stack = new Stack<Node>();
        // add the root node to the stack
        stack.push(root);
    
        // Loop until the stack is empty
        while (!stack.isEmpty()) {
            // Remove the top node from the stack
            Node current = stack.pop();
            // Visit the removed node
             output.add(current.val);
            // Add all the children of the removed node to the stack in reverse order
            for (int i = current.children.size() - 1; i >= 0; i--) {
                stack.push(current.children.get(i));
            }
        }
        return output;
    }
}
//------------complexity analysis:
/*
 * TC: Both stack and queue has tc of O(n) where n is the number of nodes and we visit each node once
 * SC: Both has O(n) maximum number of nodes that can be stored in the queue or stack at any given time is equal to the total number of nodes at the widest level in the tree.
 */