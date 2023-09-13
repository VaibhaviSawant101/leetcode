class Solution {
    public int bitwiseComplement(int n) {
        int p = 1;
        int res = 0;
        if(n == 0)
        {
            return 1;
        }
        while(n != 0)
        {
            int rem = n%2;
            rem = rem == 0 ? 1: 0;
            res += rem*p;
            p *= 2;
            n /= 2;
        }
        return res;
    }
}