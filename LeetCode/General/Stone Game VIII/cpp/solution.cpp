1class Solution {
2public:
3    int stoneGameVIII(vector<int>& stones) {
4        int n = (int)stones.size();
5        for(int i = 1; i < n; ++i)
6            stones[i] += stones[i - 1];
7        vector<int> dp(n);
8        dp[n - 1] = stones[n - 1];
9        for(int i = n - 2; i > 0; --i) {
10            dp[i] = max(dp[i + 1], stones[i] - dp[i + 1]);
11        }
12        return dp[1];
13    }
14};