/*
 * This code uses a helper function isValidBST(root, minVal, maxVal) that takes in a node and its valid value range as parameters. 
 * The function first checks if the current node is null, in which case it returns true. 
 * Then, it checks if the value of the current node is within the valid range, and if it's not it returns false
 * Finally, it recursively checks the left and right subtrees with the appropriate value range.
 * In the main function isValidBST(root) it is called with the root of the tree and the minimum and maximum possible values, which are Long.MIN_VALUE and Long.MAX_VALUE in this case.
Note:
* This code assumes that the TreeNode class has a val field and left and right fields representing the value of the node and its left and right children respectively.
 */
public class validBST{
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if (root == null) {
            return true;
        }
        if (root.val <= minVal || root.val >= maxVal) {
            return false;
        }
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }
    
}
/*
 * The time complexity of this algorithm is O(n), where n is the number of nodes in the binary search tree. This is because the algorithm visits every node in the tree exactly once in order to check its value and its left and right subtrees.
 * The space complexity of this algorithm is O(h), where h is the height of the binary search tree. This is because the algorithm uses a recursive approach, and the maximum number of recursive call that can be made is equal to the height of the tree. However, the space complexity can be O(n) in the worst case if the tree is skewed, where it calls all the nodes in the tree at once.
 */