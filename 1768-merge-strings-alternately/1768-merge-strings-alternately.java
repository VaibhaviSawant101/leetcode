class Solution {
    public String mergeAlternately(String word1, String word2) {
        int j = 0;
        String s = "";
        while(j < word1.length() && j < word2.length())
        {
            s += word1.charAt(j);
            s += word2.charAt(j);
            j++;
        }
        while(j < word1.length())
        {
            s += word1.charAt(j);
            j++;
        }
        while( j < word2.length())
        {
            s += word2.charAt(j);
            j++;
        }
        return s;
        
    }
}