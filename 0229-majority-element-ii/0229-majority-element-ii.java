class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int m1 = 0, c1=0, m2 = 0, c2 = 0;
        for(int n : nums){
            if(m1 == n)
                ++c1;
            else if(m2 == n)
                ++c2;
            else if(c1 == 0){
                m1 = n;
                c1 = 1;
            }else if(c2 == 0){
                m2 = n;
                c2 = 1;
            }else{
                --c1;
                --c2;
            }
        }
        c1 = 0; c2 = 0;
        for(int n : nums){
            if(m1 == n)
                ++c1;
            else if(m2 == n)
                ++c2;
        }
        List<Integer> list = new ArrayList<>();
        if(c1 > nums.length/3)
            list.add(m1);
        if(c2 > nums.length/3)
            list.add(m2);
        return list;
    }
}