class Solution {
    public String toLowerCase(String s) {
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
            {
                int value = (int)ch;
                value = value + 32;
                ch = (char)value;
                s = s.substring(0, i) + ch + s.substring(i+1);
            }
        }
        return s;
    }
}