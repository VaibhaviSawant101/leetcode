class Solution {
    public int[] productExceptSelf(int[] nums) {
        int countZero = 0;
        int prod = 1;
        int ifZeroprod = 1;
        int pos = 0;
        for(int i = 0; i < nums.length; i++)
        {
            prod *= nums[i];
            if(nums[i] == 0)
            {
                countZero++;
                pos = i;
            }
            else
            {
                ifZeroprod *= nums[i];
            }
        }
        if(countZero == 1)
        {
            int[] res = new int[nums.length];
            // prod = 1;
            // for(int i = 0; i < nums.length; i++)
            // {
            //     if(nums[i] ==  0)
            //     {
            //         pos = i;
            //     }
            //     else
            //     {
            //         prod *= nums[i];
            //     }
            // }
            res[pos] = ifZeroprod;
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