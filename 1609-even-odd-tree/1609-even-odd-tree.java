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
    public boolean helper(ArrayList<Integer> ls, int level)
    {
        if(level % 2 == 0)
        {
            if(ls.size() == 1)
            {
                if(ls.get(0)%2 == 0)
                    return false;
            }
            for(int i = 0; i < ls.size()-1; i++)
            {
                int a = ls.get(i);
                int b = ls.get(i+1);
                if(a % 2 == 0 || b % 2 == 0 || b <= a)
                    return false;
            }
        }
        else
        {
            if(ls.size() == 1)
            {
                if(ls.get(0)%2 != 0)
                    return false;
            }
            for(int i = 0; i < ls.size()-1; i++)
            {
                int a = ls.get(i);
                int b = ls.get(i+1);
                if(a % 2 != 0 || b % 2 != 0 || b >= a)
                    return false;
            }
        }
        return true;
    }
    
    public boolean isEvenOddTree(TreeNode root) {
        Queue <TreeNode> q = new LinkedList<>();
        ArrayList<Integer> ls;
        q.add(root);
        if(root.val%2 == 0)
            return false;
        q.add(new TreeNode(-1));
        int count = 1;
        while(!q.isEmpty() || q.size()  <= 2 && q.peek().left == null && q.peek().right == null)
        {
            ls = new ArrayList<>();
            TreeNode a = q.remove();
            while( a.val != -1)
            {
                int data;
                if(a.left != null)
                {
                    data = a.left.val;
                    q.add(a.left);
                    ls.add(data);
                }
                if(a.right != null)
                {
                    data = a.right.val;
                    q.add(a.right);
                    ls.add(data);
                }
                a = q.remove();
            }
            System.out.println(count);
            for(int v : ls)
            {
                System.out.print(v+" ");
            }
            if(!helper(ls, count))
                return false;
            if(ls.size() == 0)
                break;
            q.add(new TreeNode(-1));
            count++;
            
        }
        return true;
    }
}