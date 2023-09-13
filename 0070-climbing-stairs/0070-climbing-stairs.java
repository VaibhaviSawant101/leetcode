class Solution {
    public int climbStairs(int n) {
        int a = 1;
        int b = 2;
        if(n == 1)
        {
            return a;
        }
        else if(n == 2)
        {
            return b;
        }
        else
        {
            int c = 0;
            for(int i = 0; i < n-2; i++)
            {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
        
    }
}