class Solution {
    public int digit(int n)
    {
        int count = 0;
        while(n > 0){
            n = n/10;
            count++;
        }
        return count;
    }

    public int digitsum(int n)
    {
        int temp = n;
        int sum = 0;
        while(temp > 0)
        {
            int rem = temp%10;
            sum += rem*rem;
            temp = temp/10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
       if(n == 1 || n == 7)
       {
           return true;
       }
       else
       {
            int count = digit(n);
            int temp = n;
            while(count > 1)
           {
               temp = digitsum(temp);
               count = digit(temp);
               if(temp == 1 || temp == 7)
               {
                   return true;
               }
           }
           return false;
       }
    }
}