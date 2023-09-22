class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = t.length()-1;
        int j = s.length()-1;
        if(j > i)
            return false;
        while(i >= 0 && j >= 0)
        {
            if(s.charAt(j) == t.charAt(i))
            {
                j--;
            }
            i--;
        }
        if(j >= 0)
            return false;
        else
            return true;
    }
}