class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0)
        {
            return false;
        }
        else
        {
            while(n != 1)
            {
                if(n % 3== 0)
                {
                    n /= 3;
                }
                else
                {
                    return false;
                }
            }
            return true;
        }
    }
}