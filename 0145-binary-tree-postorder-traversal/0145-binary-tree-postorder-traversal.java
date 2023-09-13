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
    List<Integer> lst = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null)
        {
            return lst;
        }
        lst = postorderTraversal(root.left);
        lst = postorderTraversal(root.right);
        lst.add(root.val);

        return lst;
    }
}