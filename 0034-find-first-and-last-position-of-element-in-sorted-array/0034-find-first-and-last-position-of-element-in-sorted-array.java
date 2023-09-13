class Solution {
    public int firstOcc(int[] arr, int key)
    {
        int st = 0;
        int end = arr.length-1;
        int mid = st + (end-st)/2;
        int ans = -1;
        while(st <= end)
        {
            if(arr[mid] == key)
            {
                ans = mid;
                end = mid-1;
            }
            else if(arr[mid] > key)
            {
                end = mid-1;
            }
            else
            {
                st = mid+1;
            }
            mid = st + (end-st)/2;
        }
        return ans;
    }

    public int LastOcc(int[] arr, int key)
    {
        int st = 0;
        int end = arr.length-1;
        int mid = st + (end-st)/2;
        int ans = -1;
        while(st <= end)
        {
            if(arr[mid] == key)
            {
                ans = mid;
                st = mid+1;
            }
            else if(arr[mid] > key)
            {
                end = mid-1;
            }
            else
            {
                st = mid+1;
            }
            mid = st + (end-st)/2;
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = firstOcc(nums, target);
        arr[1] = LastOcc(nums, target);
        return arr;
        
    }
}