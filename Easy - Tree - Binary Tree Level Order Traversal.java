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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // resuling list of list
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if (root==null){
            return res;
        }
        
        // queue created for holding treenodes of each level
        Queue<TreeNode> q = new LinkedList<>();
        // add root node to the queue
        q.add(root);
        
        // while there is node in queue
        while (!q.isEmpty()){
            //create list of treenode in a level
            List<Integer> curr_lev_list = new LinkedList<Integer>();
            
            //travese nodes of each level and add to currennt list of intteger
            int size = q.size();
            for (int i=0; i<size; i++){
                TreeNode node = q.poll();
                curr_lev_list.add(node.val);
                
                //if the node has any sub nodes, add them to the queue
                if (node.left!=null){
                    q.add(node.left);
                }
                if (node.right!=null){
                    q.add(node.right);
                }
            }
            //add the current list to the resulting list
            res.add(curr_lev_list);
        }
        return res;
    }
}
