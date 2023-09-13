class Solution {
    public String convert(String s, int numRows) {
        String str = "";
        int end = numRows-1;

        if(numRows > 1)
        {
            for(int i = 0; i < numRows; i++)
        {
            int j = i;
            int k = 0;
            int k1 = 2*(numRows-i-1);
            int k2 = 2*i;
            while(j < s.length() && j >= 0)
            {
                str += s.charAt(j);
                if((i != end) && ((i==0) || (k%2 == 0)))
                {
                    j += k1;
                }
                else
                {
                    j += k2;
                }

                k++;

            }
        }
        }
        else
        {
            str = s;
        }
        return str;
    }
}