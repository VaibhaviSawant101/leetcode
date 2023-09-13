class Solution {
    public int pivotElement(int[] arr)
    {
        int st = 0;
        int end = arr.length-1;
        int mid = st + (end-st)/2;
        while(st < end)
        {
            if(arr[mid] >= arr[0])
            {
                st = mid+1;
            }
            else
            {
                end = mid;
            }
            mid = st + (end-st)/2;
        }
        return st;
    }

    public int BinarySearch(int[] arr, int st, int end, int key)
    {
        int mid = st + (end-st)/2;
        while(st <= end)
        {
            if(arr[mid] == key)
            {
                return mid;
            }
            else if (arr[mid] < key)
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

    public int search(int[] nums, int target) {
        int pivot = pivotElement(nums);
        int n = nums.length-1; 
        int index;
        if(nums[pivot] <= target && target <= nums[n])
        {
            index = BinarySearch(nums, pivot, n, target);
        }
        else
        {
            index = BinarySearch(nums, 0, pivot-1, target);
        }
        return index;
    }
}