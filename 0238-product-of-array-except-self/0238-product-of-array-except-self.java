class Solution {
    public int[] productExceptSelf(int[] nums) {
        int countZero = 0;
        int prod = 1;
        for(int i = 0; i < nums.length; i++)
        {
            prod *= nums[i];
            if(nums[i] == 0)
            {
                countZero++;
            }
        }
        if(countZero == 1)
        {
            int[] res = new int[nums.length];
            int pos = 0;
            prod = 1;
            for(int i = 0; i < nums.length; i++)
            {
                if(nums[i] ==  0)
                {
                    pos = i;
                }
                else
                {
                    prod *= nums[i];
                }
            }
            res[pos] = prod;
            return res;
        }
        else if(countZero > 1)
        {
            int[] res = new int[nums.length];
            return res;
        }
        else
        {
            for(int i = 0; i < nums.length; i++)
            {
                nums[i] = prod/nums[i];
            }
            return nums;
        }
    }
}