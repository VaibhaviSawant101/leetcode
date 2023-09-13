class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> ans = new ArrayList<>();
        int[] a = new int[1001];
        for(int i = 0; i < 1001; i++)
        {
            a[i] = 0;
        }
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length;j++)
            {
                int ind = nums[i][j];
                a[ind]++;
            }
        }
        for(int i = 0; i < 1001; i++)
        {
            if(a[i] >= nums.length)
            {
                ans.add(i);
            }
        }
        return ans;
    }
}