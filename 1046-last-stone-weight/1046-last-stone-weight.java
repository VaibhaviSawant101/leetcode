class Solution {
    public int[] findTwolargest(int[] arr)
    {
        if(arr.length < 2)
            return arr;
        for(int i = 0; i < 2; i++)
        {
            int lar = i;
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[j] > arr[lar])
                {
                    lar = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[lar];
            arr[lar] = temp;
            
        }
        return arr;
    }
    

    public int lastStoneWeight(int[] stones) {
        int len = stones.length;
        while(len > 1)
        {
            stones = findTwolargest(stones);
            if(stones[0] != stones[1])
            {
                stones[0] = stones[0]-stones[1];
                stones[1] = -1;
                len--;
            }
            else
            {
                stones[0] = stones[1] = -1;
                len -= 2;
            }
        }
        stones = findTwolargest(stones);
        if(stones[0] == -1)
            return 0;
        return stones[0];
    }
}