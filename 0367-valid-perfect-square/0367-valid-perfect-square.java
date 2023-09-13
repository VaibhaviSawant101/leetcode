class Solution {
    public boolean isPerfectSquare(int num) {
        long st = 0;
        long end = num;
        long mid = st + (end-st)/2;
        while(st<= end)
        {
            long s = mid*mid;
            if(s == num)
            {
                return true;
            }

            else if(s < num)
            {
                st = mid+1;
            }
            else
            {
                end = mid-1;
            }
            mid = st + (end-st)/2;
        }
        return false;
    }
}