class Solution {
    public static int lengthOfLastWord(String s) {
        int count = 0;
        int i = s.length()-1;
        for(int j = i; j >= 0; j--)
        {
            char ch = s.charAt(j);
            if(ch != ' ')
            {
                i = j;
                break;
            }
        }

        for(int j = i; j >= 0; j--)
        {
            char ch = s.charAt(j);
            if(ch == ' ')
            {
                break;
            }
            else
            {
                count++;
            }
        }

        return count;
    }
}