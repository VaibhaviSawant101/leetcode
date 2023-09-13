class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        int n = x ^ y;
        while(n != 0)
        {
            int rem = n%2;
            if(rem == 1)
            {
                count++;
            }
            n = n/2;
        }
        return count;
    }
}