class Solution {
    public int value(Character letter)
    {
        return (int)letter - 64;
    }
    public int titleToNumber(String columnTitle) {
        int count = columnTitle.length();
        int res = 0;
        for(int i = 0; i < columnTitle.length(); i++)
        {
            int v = value(columnTitle.charAt(i));
            res += (int)Math.pow(26, count-1)*v;
            count--;
        }

        return res;
    }
}