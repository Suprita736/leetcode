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
    int min = Integer.MAX_VALUE;
    public void getMin(TreeNode root, TreeNode r){
        if(r == null) return;
        min = Math.min(min, Math.abs(root.val - r.val));
        getMin(root, r.left);
        getMin(root, r.right);
        return;
    }
    public int minDiffInBST(TreeNode root) {
        if(root == null) return min;
        getMin(root, root.left);
        getMin(root, root.right);
        minDiffInBST(root.left);
        minDiffInBST(root.right);
        return min;
    }
}