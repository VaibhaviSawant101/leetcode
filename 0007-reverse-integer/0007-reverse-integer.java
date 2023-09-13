class Solution {
    public int reverse(int x) {
        int temp = x;
        int count = 0;
        while(temp != 0)
        {
            temp = temp/10;
            count++;
        }
        int p = (int)Math.pow(10, count-1);
        temp = x;
        long res = 0;
        while(temp != 0)
        {
            long rem = temp%10;
            res += p*rem;
            p /=10;
            temp /=10;
        }

        if(res >= -(int)Math.pow(2, 31) && res <= (int)Math.pow(2, 31)-1)
        {
            return (int)res;
        }
        else
        {
            return 0;
        }
    }
}