class Solution(object):
    def firstUniqChar(self, s):
       m=[0]*26
       for c in s:
        m[ord(c)-ord('a')]+=1
       for i in range (len(s)):
         if m[ord(s[i])-ord('a')]==1: 
            return i
       return -1