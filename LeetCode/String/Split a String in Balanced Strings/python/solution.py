class Solution(object):
    def balancedStringSplit(self, s):
        balance=0
        count=0
        for i in range(len(s)):
            k=s[i]
            if k=='R':
             balance+=1
            else :
             balance-=1
            if(balance==0):
             count+=1
        return count