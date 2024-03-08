class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count[] = new int[100];
        int res = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++)
        {
            int n = nums[i];
            count[n-1]++;
            if(count[n-1] > max)
            {
                max = count[n-1];
            }
        }
        for(int i = 0; i < count.length; i++)
        {
            if(count[i] == max)
            {
                res++;
            }
        }
        return max*res;
    }
}