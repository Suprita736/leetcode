class Solution {
    public int post = 0;
    public int in = 0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        post = postorder.length-1;
        in = inorder.length-1;
        return BST(inorder, postorder,Integer.MAX_VALUE);
    }

    public TreeNode BST(int[] inorder, int[] postorder, int limit){
        if(post < 0) return null;
        if(inorder[in] == limit){
            in--;
            return null;
        }

        TreeNode root = new TreeNode(postorder[post--]);
        root.right = BST(inorder, postorder,root.val);
        root.left = BST(inorder, postorder,limit);
        return root;
    }
}