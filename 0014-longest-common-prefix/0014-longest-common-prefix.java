class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1)
        {
            return strs[0];
        }
        else
        {
            int min = strs[0].length();
        for(int i = 1; i<strs.length; i++)
        {
            int len = strs[i].length();
            min = len < min ? len : min;
        }
        String com = "";
        for(int i = 0; i < min; i++)
        {
            char ch = strs[0].charAt(i);
            boolean flag = false;
            for(int j = 1; j < strs.length; j++)
            {
                if(strs[j].charAt(i) == ch)
                {
                    flag = true;
                }
                else
                {
                    flag = false;
                    return com;
                }
            }
            if(flag == true)
            {
                com += ch;
            }
        }
        return com;
        }
    }
}