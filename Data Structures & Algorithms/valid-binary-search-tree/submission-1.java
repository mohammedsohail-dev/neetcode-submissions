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
    boolean flag = true;
    public boolean isValidBST(TreeNode root) {
        dfs(root);
        return flag;
    }

    public void dfs(TreeNode root){
        if(root==null){
            return;
        }

        if(root.left!=null){
            flag = (root.left.val<root.val);
        }

        if(root.right!=null){
            flag = (root.right.val>root.val);
        }

        dfs(root.left);
        dfs(root.right);
    }
}
