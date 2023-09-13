class Solution {
    public boolean check(int[] nums) {
        int pair = 0;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] < nums[i-1])
            {
                pair++;
            }
            if(pair> 1)
            {
                return false;
            }
        }
        if(nums[nums.length-1] > nums[0])
        {
            pair++;
        }
        if(pair>1)
        {
            return false;
        }
        else
        {
            return true;
        }
        
    }
}