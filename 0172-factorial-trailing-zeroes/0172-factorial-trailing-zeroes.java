class Solution {
    public int trailingZeroes(int n) {
        int ans = 0;
        int deno = 5;
        while(deno <= n)
        {
            ans += n/deno;
            deno *= 5;
        }
        return ans;
    }
}