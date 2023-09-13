class Solution {
    public boolean isPalindrome(String s)
    {
        int st = 0;
        int end = s.length()-1;
        while(st <= end)
        {
            if(s.charAt(st) != s.charAt(end))
            {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int len = s.length();
        int count = len;
        while(count > 0)
        {
            for(int i = 0; i < len; i++)
            {
                int end = i+count;
                if(end <= len)
                {
                    String str = s.substring(i,end);
                    if(isPalindrome(str))
                    {
                        return str;
                    }
                }
            }
            count--;
        }
        return "";
        
    }
}
/*
if(s.length() <= 1)
        return true;
        char st = s.charAt(0);
        char end = s.charAt(s.length()-1);
        if(st == end)
        return isPalindrome(s.substring(1, s.length()-1));
        else
        return false;
*/