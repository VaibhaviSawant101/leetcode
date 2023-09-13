class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i = 0; i < letters.length; i++)
        {
            if(i == letters.length-1 && letters[i] <= target)
            {
                return letters[0];
            }
            else
            {
                if(letters[i] > target)
                {
                    return letters[i];
                }
            }
        }
        return 'a';
    }
}