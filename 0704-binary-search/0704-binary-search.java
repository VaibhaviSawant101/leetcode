class Solution {
    public int search(int[] nums, int target) {
        int st = 0;
        int end = nums.length-1;
        int mid = st + (end-st)/2;
        while(st <= end)
        {
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] < target)
            {
                st = mid+1;
            }
            else
            {
                end = mid-1;
            }
            mid = st + (end-st)/2;
        }
        return -1;
    }
}