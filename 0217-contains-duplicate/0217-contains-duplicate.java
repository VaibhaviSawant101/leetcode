class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*
        for(int j = 0; j < nums.length; j++)
        {
            for(int i = nums.length-1; i >= j+1; i--)
            {
                if(nums[j] == nums[i])
                {
                    return true;
                }
            }
        }
        return false;
        */
        Set<Integer> arry = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            arry.add(nums[i]);
        }
        if(arry.size() == nums.length)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}