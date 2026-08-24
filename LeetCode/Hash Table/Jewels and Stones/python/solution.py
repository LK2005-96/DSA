class Solution(object):
    def numJewelsInStones(self, jewels, stones):
       count=0
       for i in range(len(jewels)):
        ch=jewels[i]
        for j in range(len(stones)):
          ch1=stones[j]
          if(ch==ch1):
            count+=1
       return count
    