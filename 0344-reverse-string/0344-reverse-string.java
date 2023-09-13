class Solution {
    public void reverseString(char[] s) {
        int r = 0; 
        int l = s.length-1;
        while(r <= l)
        {
            char temp = s[r];
            s[r] = s[l];
            s[l] = temp;
            r++;
            l--;
        }
    }
}