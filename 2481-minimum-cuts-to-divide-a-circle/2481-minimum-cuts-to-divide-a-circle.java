class Solution {
    public int numberOfCuts(int n) {
        int total;
        if(n== 1)
        {
            total = 0;
        }
        else if(n % 2 == 0)
        {
            total = n/2;
        }
        else
        {
            total = n;
        }
        return total;
        
    }
}