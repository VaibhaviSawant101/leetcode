class Solution {
    public int BinarySearch(int[] arr, int st, int end, int key)
    {
        int mid = st + (end-st)/2;
        while(st <= end)
        {
            if(arr[mid] == key)
            {
                return mid;
            }
            else if(arr[mid] < key)
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

    public int pivotelement(int[] arr)
    {
        int n = arr.length;
        if(n == 1)
        {
            return 0;
        }
        else
        {
            for(int i = 0; i < n-1; i++)
            {
                if(arr[i+1] < arr[i])
                {
                    return i+1;
                }
            }
            return -1;
        }
    }

    public boolean search(int[] nums, int target) {
        int pivot = pivotelement(nums);
        int index = -1;
        int n = nums.length-1;
        if(pivot != -1)
        {
            if(nums[pivot] <= target && target <= nums[n])
        {
            index = BinarySearch(nums, pivot, n, target);
        }
        else
        {
            index = BinarySearch(nums, 0, pivot-1, target);
        }
        }
        else
        {
            index = BinarySearch(nums, 0, nums.length-1, target);
        }

        if(index >= 0)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}