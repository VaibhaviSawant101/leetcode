class Solution {
    public int noOfDigit(int num)
    {
        int count = 0;
        while(num != 0)
        {
            num /= 10;
            count++;
        }
        return count;
    }

    public int addDigits(int num) {
        while(noOfDigit(num) > 1)
        {
            int res = 0;
            while(num != 0)
                {
                    int rem = num%10;
                    num /= 10;
                    res += rem;
                }
            num = res;
        }
        return num;
    }
}