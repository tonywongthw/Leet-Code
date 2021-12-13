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
class Solution {
    public int maxDepth(TreeNode root) {
        // base case
        if (root == null){
            return 0;
        }
        
        // find max depth of left / right sub tree, and increase by one
        return (Math.max(maxDepth(root.left), maxDepth(root.right)) + 1); 
    }
}
