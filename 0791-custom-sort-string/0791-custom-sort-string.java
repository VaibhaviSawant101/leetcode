class Solution {
    public String customSortString(String order, String s) {
        int[] alpha = new int[26];
        String res = "";
        for(int i = 0; i < s.length(); i++)
        {
            int pos = s.charAt(i) - 'a';
            alpha[pos]++;
        }
        for(int i = 0; i < order.length(); i++)
        {
            int pos = order.charAt(i)-'a';
            while(alpha[pos] > 0)
            {
                res += order.charAt(i);
                alpha[pos]--;
            }
        }
        for(int i = 0; i < 26; i++)
        {
            while(alpha[i] > 0)
            {
                res += (char)('a'+ i);
                alpha[i]--;
            }
        }
        return res;
    }
}