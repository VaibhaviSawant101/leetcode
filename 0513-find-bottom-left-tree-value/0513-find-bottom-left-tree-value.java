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
    public class Data{
        int returnLeftValue;
        int count;
        
        public Data()
        {
            count = 0;
        }
    }
    
    public Data helper(TreeNode root)
    {
        if(root == null)
        {
            return new Data();
        }
        
        Data ls = helper(root.left);
        Data rs = helper(root.right);
        
        Data result = ls.count >= rs.count ? ls : rs;
        result.returnLeftValue = result.count == 0 ? root.val : result.returnLeftValue;
        result.count++;
        return result;
    }
    
    public int findBottomLeftValue(TreeNode root) {
        Data d = helper(root);
        return d.returnLeftValue;
    }
}