import java.lang.Math;
class Solution {
    public int findSpecialInteger(int[] arr) {
        double k = Math.ceil(arr.length/4);
        int count = 1;

        for(int i = 0; i < arr.length-1; i++)
        {
            if(arr[i] == arr[i+1])
            {
                count++;
                if(count > k)
                {
                    return arr[i];
                }
            }
            else
            {
                count = 1;
            }
            
        }
        return arr[0];
    }
}