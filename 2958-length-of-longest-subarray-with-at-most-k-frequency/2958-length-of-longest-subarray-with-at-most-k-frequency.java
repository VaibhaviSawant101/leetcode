class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        int ans = 1;
        HashMap<Integer, Integer> map = new HashMap<>();

        while(i < n) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            while(map.get(nums[i]) > k) {
                map.put(nums[j], map.get(nums[j])-1);
                j++;
            }
            ans = Math.max(ans, i- j + 1);
            i++;
        }
        return ans;
    }
}