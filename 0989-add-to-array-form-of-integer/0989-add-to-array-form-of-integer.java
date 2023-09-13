class Solution {
    public int sizeK(int k)
    {
        int count = 0;
        while(k != 0)
        {
            k = k/10;
            count++;
        }
        return count;
    }
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> lst = new ArrayList<Integer>();
        int i = num.length-1;
        int a = sizeK(k)-1;
        int c = 0;
        while(i >= 0 && a >= 0 )
        {
            int rem = k%10;
            int ans = num[i] + rem + c;
            k = k/10;
            c = ans>9?1:0;
            ans = ans%10;
            lst.add(0, ans);
            i--;
            a--;
        }
        while(i >= 0)
        {
            int ans = num[i] +c;
            c = ans>9?1:0;
            ans %= 10;
            lst.add(0, ans);
            i--;
        }
        while(a >= 0)
        {
            int rem = k%10;
            k = k/10;
            int ans = rem +c;
            c = ans>9?1:0;
            ans %= 10;
            lst.add(0, ans);
            a--;
        }
        if(c > 0)
        {
            lst.add(0, c);
        }
        return lst;
    }
}