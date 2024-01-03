class Solution {
    public int numberOfBeams(String[] bank) {
        int[] arr = new int[bank.length];
        for(int i = 0; i < bank.length; i++)
        {
            int count = 0;
            for(int j = 0; j < bank[i].length(); j++)
            {
                if(bank[i].charAt(j) == '1')
                    count++;
            }
            arr[i] = count;
        }
        // for(int i = 0; i < arr.length; i++)
        // {
        //     System.out.println(arr[i]);
        // }
        int a = 0;
        int b = 1;
        int sum = 0;
        while(b < arr.length)
        {
            if(arr[b] == 0)
                b++;
            else
            {
                sum += arr[a]*arr[b];
                a = b;
                b++;
            }
        }
        
        return sum;
        
    }
}