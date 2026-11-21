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
    int ans = Integer.MIN_VALUE;
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        if(ans == Integer.MIN_VALUE) ans = root.val;
        if(root.val != ans) return false;
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}