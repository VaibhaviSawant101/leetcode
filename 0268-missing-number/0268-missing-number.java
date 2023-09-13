class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int sum = length*(length+1)/2;
        System.out.println(sum);
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] <= nums.length)
            {
                sum -= nums[i];
            }
        }
        return sum;
        
    }
}