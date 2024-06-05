class Solution {
    public int[] helperCounter(String str)
    {
        int[] counter = new int[52];
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z')
            {
                int ind = ch - 'a';
                counter[ind]++;
            }
            else
            {
                int ind = ch - 'A';
                counter[ind+26]++;
            }
        }
        return counter;
    }
    
    public int longestPalindrome(String s) {
        int res = 0;
        int[] counter = helperCounter(s);
        boolean hasOdd = false;
        
        for (int i = 0; i < 52; i++) {
            if (counter[i] % 2 == 0) {
                res += counter[i];
            } else {
                res += counter[i] - 1; 
                hasOdd = true; 
            }
        }
        
        if (hasOdd) {
            res += 1; 
        }
        
        return res;
        
    }
}