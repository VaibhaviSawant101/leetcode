class Solution {
    public int[] Merge(int[]  nums1, int[] nums2)
    {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] a = new int[nums1.length +nums2.length];
        while((i < nums1.length) && (j < nums2.length))
        {
            int n1 = nums1[i];
            int n2 = nums2[j];
            if( n1 > n2)
            {
                a[k] = n2;
                j++;
            }
            else
            {
                a[k] = n1;
                i++;
            }
            k++;
        }
        while(i < nums1.length)
        {
            int n1 = nums1[i];
            a[k] = n1;
            i++;
            k++;
        }
        while(j < nums2.length)
        {
            int n2 = nums2[j];
            a[k] = n2;
            j++;
            k++;
        }
        return a;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] a = Merge(nums1, nums2);
        double ans;
        if(a.length%2 == 0)
        {
            int i = a[a.length/2-1];
            int j = a[a.length/2];
            ans = (i+j)/2.0;
        }
        else
        {
            ans = a[a.length/2];
        }
        return ans;
        
    }
}