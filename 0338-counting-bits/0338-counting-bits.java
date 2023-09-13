class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        for(int i = 1; i <= n; i++)
        {
            int count = 0;
            int num = i;
            while(num != 0)
                {
                    int rem = num%2;
                    num /= 2;
                    if(rem == 1)
                        {
                            count++;
                        } 
                }
            arr[i] = count;
        }
        return arr;
        
    }
}