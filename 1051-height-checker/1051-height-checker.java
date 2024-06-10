class Solution {
    public int[] sortHeights(int[] heights){
        int[] arr = Arrays.copyOf(heights, heights.length);
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1])
                {
                    int sm = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = sm;
                }
            }
        }
        return arr;
    }
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] expected = sortHeights(heights);
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != expected[i])
            {
                count++;
            }
        }
        return count;     
    }
}