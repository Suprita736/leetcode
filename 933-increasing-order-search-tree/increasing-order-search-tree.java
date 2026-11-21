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
    TreeNode head = new TreeNode();
    TreeNode temp = head;
    public TreeNode increasingBST(TreeNode root) {
        if(root == null) return head;
        increasingBST(root.left);
        if(head == null) {
            head = new TreeNode(root.val);
            temp = head;
        }
        else {
            TreeNode node = new TreeNode(root.val);
            temp.right = node;
            temp = temp.right;
        }
        increasingBST(root.right);
        return head.right;
    }
}