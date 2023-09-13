class Solution {
    public int GCD(int n1, int n2)
    {
        int div = n1;
        int dis = n2;
        while(dis != 0)
        {
            int temp = div;
            div = dis;
            dis = temp%dis;
        }
        return div;
    }
    public int findGCD(int[] nums) {
        //find smallest and largest number in an array
        int sm = nums[0];
        int lg = nums[0];
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] < sm)
            {
                sm = nums[i];
            }
            if(nums[i] > lg)
            {
                lg = nums[i];
            }
        }
        return GCD(lg, sm);
        
    }
}