class Solution {
    public String convertToBase7(int num) {
        int p = 1;
        int res = 0;
        while(num != 0)
        {
            int rem = num%7;
            res += rem*p;
            p *= 10;
            num /= 7;
        }
        return Integer.toString(res);
    }
}