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
        
        // check the depth of two sides of root, return the max and plus 1
        return (Math.max(maxDepth(root.left), maxDepth(root.right)) + 1); 
    }
}
