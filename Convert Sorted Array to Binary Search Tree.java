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
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }
    
    public TreeNode helper(int[] nums, int start, int end){
        // if there are no values left in the array, return null
        if (start>end){
            return null;
        }
        // add the middle node
        int m = (start+end)/2;
        TreeNode node = new TreeNode(nums[m]);
        // build the left subtree, with integers in the list smaller than the middle value
        node.left = helper(nums, start, m-1);
       // build the right subtree, with integers in the list greater than the middle value
        node.right = helper(nums, m+1, end);
        return node;
    }
}
