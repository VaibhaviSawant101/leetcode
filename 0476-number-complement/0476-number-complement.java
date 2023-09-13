class Solution {
    public int findComplement(int num) {
        int res = 0;
        int p = 1;
        while(num != 0)
        {
            int rem = num%2;
            rem = rem == 0 ? 1 : 0;
            res += rem*p; 
            p *= 2;
            num /= 2;
        }
        return res;
    }
}