1class Solution {
2public:
3    int stoneGameVIII(vector<int>& stones) {
4        int sum = 0;
5        for (int x : stones) {
6            sum += x;
7        }
8        int r = sum;
9        for (int i = stones.size() - 2; i; --i) {
10            sum -= stones[i + 1];
11            r = max(r, sum - r);
12        }
13        return r;
14    }
15};