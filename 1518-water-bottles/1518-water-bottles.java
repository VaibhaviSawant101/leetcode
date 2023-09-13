class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total_bottles = numBottles;
        int rem = numBottles;
        while(rem >= numExchange)
        {
            rem -= numExchange;
            total_bottles += 1;
            rem += 1;
        }
        return total_bottles;
    }
}