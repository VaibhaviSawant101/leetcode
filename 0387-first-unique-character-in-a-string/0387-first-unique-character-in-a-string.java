class Solution {
    public int[] countOccurence(String s)
    {
        int[] occ = new int[26];
        for(int i = 0; i < 26; i++)
        {
            occ[i] = 0;
        }
        
        for(int i = 0; i < s.length(); i++)
        {
            int ind = s.charAt(i)-'a';
            occ[ind]++;
        }
        
        return occ;
    }
    public int firstUniqChar(String s) {
        int[] occ = countOccurence(s);
        for(int i = 0; i < s.length(); i++)
        {
            int ind = s.charAt(i) - 'a';
            if(occ[ind] == 1)
                return i;
        }
        return -1;
    }
}