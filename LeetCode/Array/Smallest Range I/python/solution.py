class Solution:
    def smallestRangeI(self, A, K):
        maxi = max(A)
        mini = min(A)
        return max(0, maxi-K-mini-K)