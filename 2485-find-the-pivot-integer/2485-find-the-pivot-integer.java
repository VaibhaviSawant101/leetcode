class Solution {
    public int pivotInteger(int n) {
        int r = 1;
        int l = n;
        int rsum = 0;
        int lsum = 0;
        while(r <= l)
        {
            if(r != l)
            {
                if(rsum < lsum)
                {
                    rsum += r;
                    r++;
                }
                else if(rsum > lsum)
                {
                    lsum += l;
                    l--;
                }
                else
                {
                    rsum += r;
                    lsum += l;
                    r++;
                    l--;
                }
            }
            else
            {
                rsum += r;
                lsum += l;
                r++;
                l--;
            }
        }
        if(rsum != lsum)
            return -1;
        else
            return --r;
    }
}