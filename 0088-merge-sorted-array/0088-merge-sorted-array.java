class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        int i = 0;
        int j = 0;
        int[] res = new int[m+n];

        while(m > 0 && n > 0)
        {
            int temp1 = nums1[i];
            int temp2 = nums2[j];
            if(temp1< temp2)
            {
                res[k] = temp1;
                m--;
                i++;
            }
            else
            {
                res[k] = temp2;
                n--;
                j++;
            }
            k++;
        }

        while(m > 0)
        {
            int temp1 = nums1[i];
            res[k] = temp1;
            i++;
            m--;
            k++;
        }

        while(n > 0)
        {
            int temp2 = nums2[j];
            res[k] = temp2;
            j++;
            n--;
            k++;
        }
        
        for(int p = 0; p < res.length; p++)
        {
            nums1[p] = res[p];
        }


    }
}