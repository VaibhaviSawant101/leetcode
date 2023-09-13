import java.util.*;
class Solution {
    public int secondHighest(String s) {
        int lar = -1;
        int seclar = -1;
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(Character.isDigit(ch))
            {
                int num = Integer.parseInt(ch+"");
                if(num > lar)
                {
                    seclar = lar;
                    lar = num;
                }
                if((num > seclar) && (num < lar))
                {
                    seclar = num;
                }
            }
        }
        return seclar;
    }
}