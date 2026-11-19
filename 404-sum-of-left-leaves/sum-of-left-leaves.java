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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        int l = sumOfLeftLeaves(root.left);
        if(root.left != null && root.left.left == null && root.left.right == null) l = root.left.val;
        int r = sumOfLeftLeaves(root.right);
        if(root.right != null && root.right.left == null && root.right.right == null) r = 0;
        return l + r;
    }
}