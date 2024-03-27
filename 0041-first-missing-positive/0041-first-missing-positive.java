class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while(i < nums.length && nums[i] <= 0)
        {
            i++;
        }
        int smN = 1;
        for(i = i; i < nums.length; i++)
        {
            if(nums[i] == smN)
                smN++;
            else if(nums[i] > smN)
                return smN;
        }
        return smN;
    }
}