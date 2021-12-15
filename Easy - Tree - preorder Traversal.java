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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lst = new LinkedList<Integer>();
        
        if (root==null){
            return lst;
        } else {
            //add current node value, followed by values of left subtree and right subtree
            lst.add(root.val);
            lst.addAll(preorderTraversal(root.left));
            lst.addAll(preorderTraversal(root.right));
            return lst;
        }
    }
}
