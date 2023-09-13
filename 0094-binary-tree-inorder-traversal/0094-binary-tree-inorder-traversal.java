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
    List<Integer> lst = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null)
        {
            return lst;
        }
        lst = inorderTraversal(root.left);
        lst.add(root.val);
        lst = inorderTraversal(root.right);
        return lst;
    }
}