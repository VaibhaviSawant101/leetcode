class Solution {
    public int[] helperCounter(String str) {
    int[] counter = new int[26];
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch >= 'a' && ch <= 'z') { 
            int ind = ch - 'a';
            counter[ind]++;
        }
    }
    return counter;
}
    
    public String getCommonElement(int[] cs1, int[] cs2)
    {
        String str = "";
        for(int i = 0; i < 26; i++)
        {
            while(cs1[i] > 0 && cs2[i] > 0)
            {
                char ch = (char)(i+97);
                str += ch;
                cs1[i]--;
                cs2[i]--;
            }
        }
        return str;      
    }
    
    public List<String> commonChars(String[] words) {
        for(int i = 0; i < words.length-1; i++)
        {
            int[] cs1 = helperCounter(words[i]);
            int[] cs2 = helperCounter(words[i+1]);
            String cmmn = getCommonElement(cs1, cs2);
            System.out.println(cmmn+" ");
            words[i+1] = cmmn;
        }
        for(String val : words)
        {
            System.out.print(val+" ");
        }
        String resString = words[words.length-1];
        List<String> resArray = new ArrayList<String>();
        for(int i = 0; i < resString.length(); i++)
        {
            resArray.add(i, resString.charAt(i) +"");
        }
        return resArray;
        
    }
}