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
    public boolean isValidBST(TreeNode root) {
        return limitverifier(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean limitverifier(TreeNode root, int a, int b) {
        if(root==null){
            return true;
        }
        if(a<root.val && root.val<b){
            return limitverifier(root.left, a, root.val) && limitverifier(root.right,root.val,b);
        }
        return false;
    }
}
