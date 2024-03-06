class Solution {
    public int[] sortArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    
    public boolean searchArray(int[] arr, int st, int end, int key)
    {
        while(st <= end)
        {
            int mid = st + (end - st)/2;
            if(arr[mid] > key)
            {
                end = mid-1;
            }
            else if(arr[mid] < key)
            {
                st = mid+1;
            }
            if(arr[mid] == key)
            {
                return true;
            }
        }
        return false;
    }
    
    public boolean checkIfExist(int[] arr) {
        arr = sortArray(arr);
        for(int i = 0; i < arr.length-1; i++)
        {
            int key = arr[i]* 2;
            boolean res;
            if(key >= 0)
            {
                res = searchArray(arr, i+1, arr.length-1, key);
            }
            else
            {
                res = searchArray(arr, 0, i-1, key);
            }
            if(res)
            {
                return true;
            }
        }
        return false;
        
    }
}