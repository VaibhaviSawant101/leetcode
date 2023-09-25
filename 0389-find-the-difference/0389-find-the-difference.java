class Solution {
    public char findTheDifference(String s, String t) {
        int[] scount = new int[26];
        int[] tcount = new int[26];
        
        for(int i = 0; i < 26; i++)
        {
            scount[i] = 0;
            tcount[i] = 0;
        }
        
        for(int i = 0; i < s.length(); i++)
        {
            int sindex = s.charAt(i) -'a';
            int tindex = t.charAt(i) -'a';
            scount[sindex]++;
            tcount[tindex]++;
        }
        
        tcount[(t.charAt(t.length()-1)-'a')]++;
        
        for(int i = 0; i < 26; i++)
        {
            if(scount[i] != tcount[i])
                return (char)(i+97);
        }
        
        return 'a';
    }
}