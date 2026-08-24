import java.util.Arrays;

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n + 1][3][2]; // dp[day][transactions_left][buy/sell]
        
        // Fill DP with -1 (uncomputed states)
        for (int[][] layer : dp) 
            for (int[] arr : layer) 
                Arrays.fill(arr, -1);
        
        return find(0, 2, 1, n, prices, dp);
    }

    int find(int day, int trans, int buy, int n, int[] prices, int[][][] dp) {
        if (trans == 0 || day == n) return 0;

        if (dp[day][trans][buy] != -1) return dp[day][trans][buy]; // Return cached result
        
        if (buy != 0) { // Buying case
            return dp[day][trans][buy] = Math.max(
                -prices[day] + find(day + 1, trans, 0, n, prices, dp),
                find(day + 1, trans, 1, n, prices, dp)
            );
        } else { // Selling case
            return dp[day][trans][buy] = Math.max(
                prices[day] + find(day + 1, trans - 1, 1, n, prices, dp),
                find(day + 1, trans, 0, n, prices, dp)
            );
        }
    }
}