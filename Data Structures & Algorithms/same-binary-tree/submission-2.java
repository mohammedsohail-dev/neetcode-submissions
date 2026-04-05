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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> p_list = new ArrayList<>();
        ArrayList<Integer> q_list = new ArrayList<>();
        DFS(p,p_list);
        DFS(q,q_list);
        return p_list.equals(q_list);
    }

    public void DFS(TreeNode p, ArrayList<Integer> container){
        if(p==null){
            container.add(null);
            return;
        }
        container.add(p.val);
        DFS(p.left,container);
        DFS(p.right,container);
    }
}
