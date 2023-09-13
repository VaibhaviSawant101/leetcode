class Solution {
    public void moveZeroes(int[] nums) {
        //int[] arr = new int[nums.length]
        // Queue<Integer> que = new ArrayDeque<>();
        // for(int i = 0; i < nums.length; i++)
        // {
        //     if(nums[i] != 0)
        //     {
        //         que.add(nums[i]);
        //     }
        // }
        // int i = 0;
        // int size = que.size();
        // while(que.size() > 0)
        // {
        //     nums[i] = que.remove();
        //     i++;
        // }
        // for(i = size; i < nums.length; i++)
        // {
        //     nums[i] = 0;
        // }

        int[] res = new int[nums.length];
        int i = 0;
        int st = 0;
        int end = nums.length-1;
        while(st <= end)
        {
            if(nums[i] != 0)
            {
                res[st] = nums[i];
                st++;
            }
            else
            {
                res[end] = nums[i];
                end--;
            }
            i++;
        }

        for(int p = 0; p < res.length; p++)
        {
            nums[p] = res[p];
        }

    }
}