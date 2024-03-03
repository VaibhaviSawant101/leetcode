class Solution {
    public String replaceDigits(String s) {
        String res = "";
        for(int i = 0; i < s.length(); i++)
        {
            if(i %2 != 0)
            {
                char prev = s.charAt(i-1);
                int add = s.charAt(i) - '0';
                char pres = (char)(prev+add);
                res += pres;
            }
            else
            {
                res += s.charAt(i);
            }
        }
        return res;
    }
}