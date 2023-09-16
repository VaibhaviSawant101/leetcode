class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i]%2 == 0)
            {
                even.add(nums[i]);
            }
            else
            {
                odd.add(nums[i]);
            }
        }
        int i = 0;
        while(even.size() != 0)
        {
            nums[i++] = even.remove(0);
        }
        while(odd.size() != 0)
        {
            nums[i++] = odd.remove(0);
        }
        
        return nums;
    }
}