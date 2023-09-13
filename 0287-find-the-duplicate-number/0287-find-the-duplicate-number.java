class Solution {
    public int findDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++)
        {
            int pos = nums[i];
            if(pos < 0)
            {
                pos *= -1;
            }
            if(nums[pos] < 0)
            {
                if(nums[i] < 0)
                {
                    return nums[i]*-1;
                }
                else
                {
                    return nums[i];
                }
            }
            else
            {
                nums[pos] *= -1;
            }
        }
        return 0;
    }
}