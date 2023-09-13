class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length-1; i++)
        {
            int sm = i;
            for(int j = i+1; j < nums.length; j++)
            {
                if(nums[j]*nums[j] < nums[sm]*nums[sm])
                {
                    sm = j;
                }
            }
            if(sm == i)
            {
                nums[i] = nums[sm]*nums[sm];
            }
            else
            {
                int temp = nums[i];
                nums[i] = nums[sm]*nums[sm];
                nums[sm] = temp;
            }
        }
        nums[nums.length-1] = nums[nums.length-1]*nums[nums.length-1];
        return nums;
    }
}