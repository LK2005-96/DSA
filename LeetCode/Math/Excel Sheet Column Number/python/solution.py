class Solution(object):
    def titleToNumber(self, columnTitle):
        """
        :type columnTitle: str
        :rtype: int
        """
        total = 0
        for char in columnTitle:
            # Convert letter to number: 'A' -> 1, 'B' -> 2, ..., 'Z' -> 26
            value = ord(char.upper()) - ord('A') + 1
            total = total * 26 + value
        return total