class Solution {
    public int[] sortAry(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    
    public boolean canBeEqual(int[] target, int[] arr) {
        if(arr.length == target.length)
        {
            target = sortAry(target);
            arr = sortAry(arr);
            for(int i = 0; i < target.length; i++)
            {
                if(target[i]!=arr[i])
                {
                    return false;
                }
            }
            return true;
        }
        return false;   
    }
}