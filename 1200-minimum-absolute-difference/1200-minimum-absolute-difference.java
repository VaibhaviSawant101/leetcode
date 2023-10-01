class Solution {
    
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ls = new ArrayList<>();
        
        int[] dif = new int[arr.length-1];
        
        int sm = arr[1]-arr[0];
        
        for(int i = 0; i < dif.length; i++)
        {
            dif[i] = arr[i+1]-arr[i];
            if(dif[i] < sm)
            {
                sm = dif[i];
            }
        }
        
        for(int i = 0; i < dif.length; i++)
        {
            if(dif[i] == sm)
            {
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                ls.add(temp);
            }
        }
        
        return ls;   
    }
}