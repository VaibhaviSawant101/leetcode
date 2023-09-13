class Solution {
    public boolean isUgly(int n) {
        if(n == 0)
        {
            return false;
        }
        int[] arr = {2, 3, 5};
        for(int i = 0; i < arr.length; i++)
        {
            if(n == 1)
            {
                return true;
            }
            if(n % arr[i] == 0)
            {
                n /= arr[i];
                i--;
            }
        }
        return false;
    }
}