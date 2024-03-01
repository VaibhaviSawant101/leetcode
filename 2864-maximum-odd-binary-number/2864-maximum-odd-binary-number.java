class Solution {
    public int countOnes(String s)
    {
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '1')
                count++;
        }
        return count;
    }
    
    public String maxNumber(int count, int len)
    {
        String ans = "";
        for(int i = 0; i < count; i++)
        {
            ans += "1";
        }
        for(int i = 0; i < len-count; i++)
        {
            ans += "0";
        }
        return ans;
    }
    
    public String maximumOddBinaryNumber(String s) {
        int ct = s.length();
        int c1 = countOnes(s);
        
        String lar = maxNumber(c1-1, ct-1);
        lar += "1";
        return lar;
        
    }
}