class Solution {
    public String repeat(String s)
    {
        char ch = s.charAt(0);
        int count = 1;
        String str = "";
        for(int i = 1; i < s.length(); i++)
        {
            if(s.charAt(i) == ch)
            {
                count++;
            }
            else
            {
                str += String.valueOf(count) + ch;
                ch = s.charAt(i);
                count = 1;
            }
        }
        str += String.valueOf(count) + ch;
        return str;
    }

    public String countAndSay(int n) {
        String s = "1";
        for(int i = 2; i <= n; i++)
        {
            s = repeat(s);

        }
        return s;
    }
}