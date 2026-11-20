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
    int ans = 0;
    public int tilt(TreeNode root){
        if(root == null) return 0;
        int l = tilt(root.left);
        int r = tilt(root.right);
        return root.val + l + r;
    }
    public int findTilt(TreeNode root) {
        if(root == null) return ans;
        root.val = Math.abs(tilt(root.left) - tilt(root.right));
        findTilt(root.left);
        findTilt(root.right);
        ans += root.val;
        return ans;
    }
}