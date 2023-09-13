class Solution {
    public void sortColors(int[] nums) {
        //Selection sort
        int n = nums.length;
        for(int i = 0; i < n-1; i++)
        {
            int small = nums[i];
            int index = i;
            for(int j = i+1; j < n; j++)
            {
                if(nums[j] < small)
                {
                    small = nums[j];
                    index = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }

        //return nums;
    }
}