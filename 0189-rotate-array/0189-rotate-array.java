class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
         int[] arr = new int[n];
        int i = k;
        int j = 0;
        int m = n;
        while(m > 0)
        {
            arr[i%(n)] = nums[j];
            i++;
            j++;
            m--;
        }

        for(int p = 0; p < n; p++)
        {
            nums[p] = arr[p];
        }
        
    }
}