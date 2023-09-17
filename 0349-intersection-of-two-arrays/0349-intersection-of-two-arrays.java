class Solution {
    public void conquer(int[] nums, int st, int mid, int end)
    {
        int[] merged = new int[end-st+1];
        int idx1 = st;
        int idx2 = mid+1;
        int x = 0;
        
        while(idx1 <= mid && idx2 <= end)
        {
            if(nums[idx1] <= nums[idx2])
            {
                merged[x++] = nums[idx1++];
            }
            else
            {
                merged[x++] = nums[idx2++];
            }
        }
        
        while(idx1 <= mid)
        {
            merged[x++] = nums[idx1++];
        }
        
        while(idx2 <= end)
        {
            merged[x++] = nums[idx2++];
        }
        
        for(int i = 0, j = st; i < merged.length; i++, j++)
        {
            nums[j] = merged[i];
        }
        
    }
        
    public void Divide(int[] nums, int st, int end)
    {
        if(st >= end)
            return;
            
        int mid = st + (end-st)/2;
        Divide(nums, st, mid);
        Divide(nums, mid+1, end);
        conquer(nums, st, mid, end);
    }
    
    public int[] intersection(int[] nums1, int[] nums2) {
        LinkedList<Integer> ls = new LinkedList<>();
        
        Divide(nums1, 0, nums1.length-1);
        Divide(nums2, 0, nums2.length-1);
        int idx1 = 0;
        int idx2 = 0;
        while(idx1 < nums1.length && idx2 < nums2.length)
        {
            if(nums1[idx1] < nums2[idx2])
            {
                idx1++;
            }
            else if(nums1[idx1] > nums2[idx2])
            {
                idx2++;
            }
            else
            {
                if((ls.size() == 0)||(ls.size() > 0 && ls.peekLast() != nums1[idx1]))
                {
                    ls.add(nums1[idx1]);
                }
                idx1++;
                idx2++;     
            }
        }
        
        int[] arr = new int[ls.size()];
        for(int i = 0; i < ls.size(); i++)
        {
            arr[i] = ls.get(i);
        }
        return arr;
    }
}