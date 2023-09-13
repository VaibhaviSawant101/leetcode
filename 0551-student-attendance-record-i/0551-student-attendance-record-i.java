class Solution {
    public boolean checkRecord(String s) {
        int[] record = new int[2];
        for(int i = 0; i < 2; i++)
        {
            record[i] = 0;
        }

        boolean flag = false;

        for(int i = 0; i < s.length(); i++)
        {
            int j = 0;

            if(s.charAt(i) == 'A')
            {
                record[0]++;
            }

            while((i < s.length())&&(s.charAt(i) == 'L'))
            {
                j++;
                i++;
                flag = true;
            }

            if(flag == true)
            {
                i--;
                flag = false;
            }
            
            if(j > 2)
            {
                record[1]++;
            }
        }

        if(record[0] > 1 || record[1] > 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}