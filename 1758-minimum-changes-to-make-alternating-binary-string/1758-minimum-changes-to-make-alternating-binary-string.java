class Solution {
    public int helper(char ch, String s)
    {
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == ch)
            {
                if(ch == '0')
                {
                    ch = '1';
                }
                else
                {
                    ch = '0';
                }
                s = s.substring(0, i) + ch + s.substring(i+1);
                count++;
            }
            ch = s.charAt(i);
        }
        
        return count;
    }
    public int minOperations(String s) {
        int count1 = helper('0', s);
        int count2 = helper('1', s);
        if(count1 < count2)
        {
            return count1;
        }
        else
        {
            return count2;
        }
        
    }
}