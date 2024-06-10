import java.util.HashMap;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  // To handle the case where the sum is directly divisible by k

        int count = 0;
        int sum = 0;

        for (int num : nums) {
            sum += num;
            int remainder = sum % k;

            // Handle negative remainders
            if (remainder < 0) {
                remainder += k;
            }

            // If this remainder has been seen before, add the count of those occurrences
            if (map.containsKey(remainder)) {
                count += map.get(remainder);
            }

            // Update the count of this remainder in the map
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }
}
