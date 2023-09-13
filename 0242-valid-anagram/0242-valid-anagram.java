class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        ArrayList<Character> list = new ArrayList<>();
        int flag = 0;
        for(int i = 0; i < s.length(); i++)
        {
            list.add(s.charAt(i));
        }
        for(int i = 0; i < t.length(); i++)
        {
            char c = t.charAt(i);
            for(int j = 0; j < list.size(); j++)
            {
                if(c == list.get(j))
                {
                    list.remove(j);
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
            {
                return false;
            }
            flag = 0;
        }
        return true;
    }
}