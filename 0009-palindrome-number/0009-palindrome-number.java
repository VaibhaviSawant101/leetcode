class Solution {
    public boolean isPalindrome(int x) {
     int count = 0;
     int res = 0;
     int temp = x;
     while(temp != 0)
     {
         temp = temp/10;
         count++;
     }
     int p = (int)Math.pow(10, count-1);
     temp = x;
     while(temp != 0)
     {
         int rem = temp%10;
         res += rem*p;
         p /= 10;
         temp /= 10;
     }
     if(res == x && x >= 0)
     {
         return true;
     }
     else
     {
         return false;
     }
    }
}