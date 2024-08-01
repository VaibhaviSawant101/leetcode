class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i = 0; i < details.length; i++)
        {
            String str = details[i];
            int age = Integer.parseInt(""+str.charAt(11)+str.charAt(12));
            if(age > 60)
                count++;
        }
        return count;
    }
}