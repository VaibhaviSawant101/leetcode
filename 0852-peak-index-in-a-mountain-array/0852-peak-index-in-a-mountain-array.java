class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int st = 0;
        int end = arr.length-1;
        int mid = st + (end-st)/2;
        int peak = -1;
        while(st < end)
        {
            if(arr[mid] < arr[mid+1])
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
}