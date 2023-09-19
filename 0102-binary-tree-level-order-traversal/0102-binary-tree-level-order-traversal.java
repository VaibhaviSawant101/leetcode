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
import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> app = new ArrayList<>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty())
        {
            TreeNode curr = q.remove();
            if(curr == null)
            {
                res.add(app);
                if(q.isEmpty())
                    break;
                
                else
                {
                    app = new ArrayList<>();
                    q.add(null);
                }
            }
            
            else
            {
                app.add(curr.val);
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        
        return res;
    }
}