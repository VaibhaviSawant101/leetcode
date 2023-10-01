class Solution {
    public String reverseWord(String s)
    {
        int st = 0;
        int end = s.length()-1;
        while(st < end)
        {
            char cSt = s.charAt(st);
            char cEnd = s.charAt(end);
            s = s.substring(0, st) + cEnd + s.substring(st+1, end) + cSt + s.substring(end+1);
            st++;
            end--;
        }
        return s;
    }
    
    public String reverseWords(String s) {
        String str = "";
        String res = "";
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != ' ')
            {
                str += s.charAt(i);
            }
            else
            {
                res += reverseWord(str)+" "; 
                str = "";
            }
        }
        if(str.length() != 0)
        {
            res += reverseWord(str); 
            str = "";
        }
        return res;
    }
}