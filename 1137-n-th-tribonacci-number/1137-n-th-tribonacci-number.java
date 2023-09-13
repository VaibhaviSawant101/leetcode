class Solution {
    public int tribonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        for(int i = 0; i < n; i++)
        {
            int d = a+b+c;
            a = b;
            b = c;
            c = d;
        }
        return a;
    }
}
/*if(n == 0)
        return 0;
        else if(n==1)
        return 1;
        else if(n==2)
        return 1;
        else
        return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3); */