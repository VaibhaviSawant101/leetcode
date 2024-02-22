import java.lang.Math;
class Solution {
    public int returnBase(int n)
    {
        int count = 0;
        while(n != 0)
        {
            n = n/2;
            count++;
        }
        return count-1;
        
    }
    public int rangeBitwiseAnd(int left, int right) {
        if(left == right)
        {
            return left;
        }
        int a = returnBase(left);
        int b = returnBase(right);
        if(a != b)
        {
               return 0;
        }
        else
        {
            int base = (int)Math.pow(2, a);
            int x = left; 
            if(left%2 == 0 && right-left == 1)
            {
                return left;
            }
            else if(left%2 == 0)
            {
                x = left+1;
            }
            int y= x+1;
            int sm = (int)Math.pow(2, a+1);
            while(y <= right)
            {
                int c = x&y;
                if(c < sm)
                {
                    sm = c;
                    if(sm == base)
                    {
                        return base;
                    }
                }
                x += 2;
                y += 2;
            }
            return sm;
        }
    }
}