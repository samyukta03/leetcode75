import java.util.*;

// Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class BSTlevelorder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // queue to hold nodes at each level
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        // list to hold all levels
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        // Check if the root is null, if so, return an empty list
        if(root==null){
            return wrapList;
        }
        // Add the root node to the queue
        queue.offer(root);
        // Iterate over the queue until it's empty
        while(!queue.isEmpty()){
            // Get the number of nodes at the current level
            int levelNum = queue.size();
            // Create a sublist to hold the values of the nodes at the current level
            List<Integer> subList = new LinkedList<Integer>();
            // Iterate over the number of nodes at the current level
            for(int i=0; i<levelNum; i++){
                // If the left child of the current node is not null, add it to the queue
                if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }
                // If the right child of the current node is not null, add it to the queue
                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }
                // Add the current node's value to the sublist
                subList.add(queue.poll().val);
            }
            // Add the sublist to the wrapList
            wrapList.add(subList);
        }
        return wrapList;
    }
    public static void main(String[] args) {
        BSTlevelorder bst  = new BSTlevelorder();
        TreeNode tree = new TreeNode(3, new TreeNode(5, new TreeNode(9,null,null), new TreeNode(11,null,null)), new TreeNode(7,new TreeNode(6,null,null),null));
        List<List<Integer>>list = new ArrayList<List<Integer>>();
        list = bst.levelOrder(tree);
        for(List i:list) System.out.println(i);
    }
}
