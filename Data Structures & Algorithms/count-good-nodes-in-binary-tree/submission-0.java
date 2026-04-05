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
    int count = 0;
    public int goodNodes(TreeNode root) {
        int max_val = root.val;
        goodNodes_val(root,max_val);
        return count;
    }

    public void goodNodes_val(TreeNode root, int max_val){
        if(root==null){
            return;
        }

        if(max_val<=root.val){
            count++;
            max_val = root.val;
        }

        goodNodes_val(root.left,max_val);
        goodNodes_val(root.right,max_val);
    }
}
