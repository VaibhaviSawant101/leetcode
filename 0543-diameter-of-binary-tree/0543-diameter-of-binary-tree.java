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
    public int height(TreeNode root)
    {
        if(root == null)
            return 0;
        
        int x = height(root.left);
        int y = height(root.right);
        
        return Math.max(x, y)+1;
        
    }
    
    public int diameter(TreeNode root)
    {
        if(root == null)
            return 0;
        
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left)+height(root.right)+1;
        
        return Math.max(diam3, Math.max(diam1, diam2));
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        int val = diameter(root)-1;
        return val;
    }
}