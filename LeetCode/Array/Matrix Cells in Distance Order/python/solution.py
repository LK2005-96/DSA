class Solution:
    def allCellsDistOrder(self, rows, cols, rCenter, cCenter) :
        d, res = defaultdict(list), []
        for i in range(rows):
            x = abs(i - rCenter)
            for j in range(cols):
                dist = x + abs(j - cCenter)
                d[dist].append([i, j])
        for i in sorted(d): res += d[i]
        return res