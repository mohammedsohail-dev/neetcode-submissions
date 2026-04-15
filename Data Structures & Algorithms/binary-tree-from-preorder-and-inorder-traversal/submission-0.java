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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0){
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        int loc = 0;
        for(int i = 0;i<inorder.length;i++){
            if(inorder[i] == preorder[0]){
                loc = i;
                break;
            }
        }

        int[] inleft = new int[loc];
        int[] inright = new int[inorder.length-loc-1];
        int[] preleft = new int[inleft.length];
        int[] preright = new int[inright.length];
        
        for(int x = 0;x<inleft.length;x++){
            inleft[x] = inorder[x];
        }

        for(int y = 0;y<inright.length;y++){
            inright[y] = inorder[loc+1+y];
        }

        for(int z = 0;z<preleft.length;z++){
            preleft[z] = preorder[z+1];
        }

        for(int p = 0;p<preright.length;p++){
            preright[p] = preorder[preleft.length+1+p];
        }



        root.left = buildTree(preleft,inleft);
        root.right = buildTree(preright,inright);

        return root;
        
    }
}
