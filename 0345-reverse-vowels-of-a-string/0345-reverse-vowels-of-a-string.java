class Solution {
    public boolean checkIfVowel(char a)
    {
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'|| a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public String reverseVowels(String s) {
        int r = 0;
        int l = s.length()-1;
        while(r < l)
        {
            char rchar = s.charAt(r);
            char lchar = s.charAt(l);
            if(!checkIfVowel(rchar))
            {
                r++;
            }
            else if(!checkIfVowel(lchar))
            {
                l--;
            }
            
            else if(checkIfVowel(rchar) && checkIfVowel(lchar))
            {
                s = s.substring(0, r) + lchar +s.substring(r+1, l)+rchar+s.substring(l+1, s.length());
                r++;
                l--;
            }
        }
        return s;

    }
}