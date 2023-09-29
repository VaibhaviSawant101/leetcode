class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean flag = true;
        for(int i = 0; i < nums.length-1; i++)
        {
           if(nums[i+1] < nums[i])
           {
               nums[i] = -1;
               flag = false;
           }
           else if(nums[i+1] > nums[i])
           {
               nums[i] = 1;
           }
           else
           {
               nums[i] = 0; 
           }
        }
        for(int i = 0; i <nums.length-1; i++)
        {
            if(flag == false)
            {
                if(nums[i] > 0)
                    return false;
            }
            else
            {
                if(nums[i] < 0)
                    return false;
            }
        }
        return true;
    }
}