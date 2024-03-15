class Solution {
    private int[] sumArray(int[] nums)
    {
        int sum = 0;
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            res[i] = sum;
        }
        return res;
    }
    
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int[] res = sumArray(nums);
        for(int i = 0; i <nums.length; i++)
        {
            int sub = 0;
            for(int j = i; j < nums.length; j++)
            {
                if(j == i)
                {
                    sub = res[j]-nums[j];
                }
                int sum = res[j]-sub;
                if(sum == goal)
                    count++;
            }
        }
        return count;
    }
}

 // int sum = 0;
 //                for(int k = 0; k <= j-i; k++)
 //                {
 //                    sum += nums[k+i];
 //                }
 //                if(sum == goal)
 //                {
 //                    count++;
 //                }