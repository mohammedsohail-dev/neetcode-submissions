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
            if(root.left.val>=root.val){
                flag = false;
            }
        }

        if(root.right!=null){
            if(root.right.val<=root.val){
                flag = false;
            }
        }

        dfs(root.left);
        dfs(root.right);
    }
}
