class Solution {
    public int findDuplicate(int[] nums) {
        int num[]=new int[nums.length];
        for(int i:nums)
        {  
            if(num[i-1]==1) return i;
            num[i-1]=1;
           
        }return -1;
    }
}