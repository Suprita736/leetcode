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
    public boolean isSame(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if((p != null && q == null) || (p == null && q != null)) return false;
        boolean l = isSame(p.left, q.right);
        if(p.val != q.val) l = false;
        boolean r = isSame(p.right,q.left);
        if(p.val != q.val) r = false;
        return l && r;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        boolean ans = isSame(root.left, root.right);
        return ans;
    }
}